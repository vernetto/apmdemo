package org.pierre.apmdemo.server;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class EmployeeEntity {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String role;

}
