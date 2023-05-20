package com.companyProject.companyProject.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sirketler")
public class Sirket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String adi;


}
