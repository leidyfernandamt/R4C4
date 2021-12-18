package com.Reto4ciclo4.reto4;

import com.Reto4ciclo4.reto4.repository.Crudrepository.LaptopCrudRepository;
import com.Reto4ciclo4.reto4.repository.Crudrepository.OrderCrudRepository;
import com.Reto4ciclo4.reto4.repository.Crudrepository.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;




@Component
@SpringBootApplication
public class Reto4Application implements CommandLineRunner{

    @Autowired
    private LaptopCrudRepository laptopCrudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private OrderCrudRepository orderCrudRepository;

    public static void main(String[] args) {
        SpringApplication.run(Reto4Application.class, args);
    }
 
    
    @Override
    public void run(String... args) throws Exception {
       laptopCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();
    }
}
