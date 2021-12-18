
package com.Reto4ciclo4.reto4.repository.Crudrepository;

import com.Reto4ciclo4.reto4.model.Order;
import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author lei20
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer>{
 
    List<Order> findBySalesManZone(String zone);
    List<Order> findBySalesManId(Integer id);
    List<Order> findBySalesManIdAndStatus(Integer id, String status);
    List<Order> findByRegisterDayAndSalesManId(Date registerDay, Integer id);

    
    
}
