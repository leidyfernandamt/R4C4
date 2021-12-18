
package com.Reto4ciclo4.reto4.repository;

import com.Reto4ciclo4.reto4.model.Laptop;
import com.Reto4ciclo4.reto4.repository.Crudrepository.LaptopCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lei20
 */

@Repository
public class LaptopRepository {
    
    @Autowired
    private LaptopCrudRepository laptopCrudRepository;

    public List<Laptop> getAll(){
        return laptopCrudRepository.findAll();
    }

    public Optional<Laptop> getLaptop(int id){
        return laptopCrudRepository.findById(id);
    }

    public Laptop save(Laptop laptop){
        return laptopCrudRepository.save(laptop);
    }

    public void update(Laptop laptop){
        laptopCrudRepository.save(laptop);
    }

    public void delete(Laptop laptop){
        laptopCrudRepository.delete(laptop);
    }
    
}
