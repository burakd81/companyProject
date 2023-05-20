package com.companyProject.companyProject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.companyProject.companyProject.Services.SirketService;
import com.companyProject.companyProject.model.Sirket;

@RestController
@RequestMapping("/api/company")
public class SirketController {

    @Autowired
    SirketService sirketService;


    @PostMapping("/create")
    public ResponseEntity<Sirket> sirketEkle(@RequestBody Sirket sirket) {
        Sirket yeniSirket = sirketService.sirketEkle(sirket);
        return new ResponseEntity<>(yeniSirket, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> sirketSil(@PathVariable("id") Long id) {
        sirketService.sirketSil(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sirket> sirketGuncelle(@PathVariable("id") Long id, @RequestBody Sirket sirket) {
        Sirket guncellenmisSirket = sirketService.sirketGuncelle(sirket);
        return new ResponseEntity<>(guncellenmisSirket, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Sirket>> sirketleriListele() {
        List<Sirket> sirketler = sirketService.sirketleriListele();
        return new ResponseEntity<>(sirketler, HttpStatus.OK);
    }
}
