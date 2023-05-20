package com.companyProject.companyProject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "calisanlar")
public class Calisan {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String adi;
    private String pozisyon;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sirket_id")
    private Sirket sirket;

    
}
