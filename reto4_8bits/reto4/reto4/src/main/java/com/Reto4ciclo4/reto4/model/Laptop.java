
package com.Reto4ciclo4.reto4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author lei20
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "laptops")
public class Laptop {
    
    @Id
    private Integer id;
    private String brand;
    private String model;
    private String procesor;
    private String os;
    private String description;
    private String memory;
    private String hardDrive;
    private boolean availability;
    private double price;
    private Integer quantity;
    private String photography;
    
}
