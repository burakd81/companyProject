package com.companyProject.companyProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.companyProject.companyProject.Services.CalisanService;
import com.companyProject.companyProject.model.Calisan;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class CalisanController {

    @Autowired
    CalisanService calisanService;


    @PostMapping("/create")
    public ResponseEntity<Calisan> calisanEkle(@RequestBody Calisan calisan) {
        Calisan yeniCalisan = calisanService.calisanEkle(calisan);
        return new ResponseEntity<>(yeniCalisan, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> calisanSil(@PathVariable("id") Long id) {
        calisanService.calisanSil(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Calisan> calisanGuncelle(@PathVariable("id") Long id, @RequestBody Calisan calisan) {
        Calisan guncellenmisCalisan = calisanService.calisanGuncelle(calisan);
        return new ResponseEntity<>(guncellenmisCalisan, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Calisan>> calisanlariListele() {
        List<Calisan> calisanlar = calisanService.calisanlariListele();
        return new ResponseEntity<>(calisanlar, HttpStatus.OK);
    }
    
}
