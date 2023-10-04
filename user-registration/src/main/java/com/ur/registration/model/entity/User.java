package com.ur.registration.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users", schema = "public")
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private Boolean active;
}
