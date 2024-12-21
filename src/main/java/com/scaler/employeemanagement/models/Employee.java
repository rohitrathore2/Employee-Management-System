//package com.scaler.employeemanagement.models;
//
//import jakarta.persistence.Entity;
//import lombok.*;
//
//@Data
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//
//public class Employee {
//    private Long id;
//    private String name;
//    private String phone;
//    private String email;
//}
//--------------------------------------
//package com.scaler.employeemanagement.models;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import lombok.*;
//
//@Entity                  // Marks this class as a JPA entity (database table)
//@Data                    // Lombok: generates getters, setters, toString, etc.
//@NoArgsConstructor       // Lombok: generates no-args constructor
//@AllArgsConstructor      // Lombok: generates all-args constructor
//public class Employee {
//    @Id                                                     // Marks this as primary key
//    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Auto-generates ID values
//    private Long id;
//
//    private String name;
//    private String phone;
//    private String email;
//}
//////
//package com.scaler.employeemanagement.models;
//
//        import jakarta.persistence.Entity;
//        import jakarta.persistence.Id;
//        import jakarta.persistence.GeneratedValue;
//        import jakarta.persistence.GenerationType;
//        import lombok.Data;
//        import lombok.NoArgsConstructor;
//        import lombok.AllArgsConstructor;
//
//@Entity
//@Data                    // This generates getters and setters
//@NoArgsConstructor       // Generates no-args constructor
//@AllArgsConstructor      // Generates all-args constructor
//public class Employee {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private String phone;
//    private String email;
//}
//------------------------------------------------------------
//package com.scaler.employeemanagement.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import lombok.Data;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.GeneratedValue;
//
//@Data
//@Entity
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class Employee {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    private String name;
//    private String department;
//    private Double salary;
//
//    // Default constructor
//    public Employee() {
//    }
//
//    // Custom constructor
//    public Employee(Long id, String name, String department, Double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }
//}

//----------------------
package com.scaler.employeemanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String email;

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }
}
