
package com.Reto4ciclo4.reto4.repository.Crudrepository;

import com.Reto4ciclo4.reto4.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author lei20
 */
public interface UserCrudRepository  extends MongoRepository <User, Integer>{
    
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
    Optional<User> findByNameOrEmail(String name, String email);
    
}
