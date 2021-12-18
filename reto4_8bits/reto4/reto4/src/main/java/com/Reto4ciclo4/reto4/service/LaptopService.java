
package com.Reto4ciclo4.reto4.service;

import com.Reto4ciclo4.reto4.model.Laptop;
import com.Reto4ciclo4.reto4.repository.LaptopRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lei20
 */
@Service
public class LaptopService {
    
     @Autowired
    private LaptopRepository laptopRepository;

    public List<Laptop> getAll(){
        return laptopRepository.getAll();
    }

    public Optional<Laptop> getLaptop(int id){
        return laptopRepository.getLaptop(id);
    }

    public Laptop save(Laptop laptop){
        if (laptop.getId()== null){
            return laptop;
        }
        return laptopRepository.save(laptop);
    }

    public Laptop update(Laptop laptop){
        if (laptop.getId()!= null){
            Optional<Laptop> dbLaptop = laptopRepository.getLaptop(laptop.getId());
            if (!dbLaptop.isEmpty()){
                if (laptop.getBrand()!= null){
                    dbLaptop.get().setBrand(laptop.getBrand());
                }
                 if (laptop.getModel()!= null){
                    dbLaptop.get().setModel(laptop.getModel());
                }
                if (laptop.getProcesor()!= null){
                   dbLaptop.get().setProcesor(laptop.getProcesor());
                }
                if (laptop.getOs()!= null){
                    dbLaptop.get().setOs(laptop.getOs());
                }
                if (laptop.getDescription() != null){
                    dbLaptop.get().setDescription(laptop.getDescription());
                }
                if (laptop.getMemory()!= null){
                    dbLaptop.get().setMemory(laptop.getMemory());
                }
                if (laptop.getHardDrive()!= null){
                   dbLaptop.get().setHardDrive(laptop.getHardDrive());
                }

                dbLaptop.get().setAvailability(laptop.isAvailability());

                if (laptop.getPrice()!= 0.0){
                    dbLaptop.get().setPrice(laptop.getPrice());
                }
                if (laptop.getQuantity()!= 0){
                    dbLaptop.get().setQuantity(laptop.getQuantity());
                }
                if (laptop.getPhotography()!= null){
                    dbLaptop.get().setPhotography(laptop.getPhotography());
                }
                laptopRepository.update(dbLaptop.get());
                return dbLaptop.get();
            } else {
                return laptop;
            }
        } else {
            return laptop;
        }
    }

    public boolean delete(int id){
        return getLaptop(id).map(laptop -> {
            laptopRepository.delete(laptop);
            return true;
        }).orElse(false);
    }
    
}
