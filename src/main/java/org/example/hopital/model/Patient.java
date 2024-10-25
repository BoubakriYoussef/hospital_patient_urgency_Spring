package org.example.hopital.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;

@Table(name="patient")
@Entity
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String gender;
    private Date birthDate;
    private String birthPlace;
    private String birthCountry;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String address;
    private int urgencyLevel;


}
