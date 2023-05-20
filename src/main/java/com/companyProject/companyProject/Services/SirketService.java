package com.companyProject.companyProject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyProject.companyProject.model.Sirket;
import com.companyProject.companyProject.repository.ISirketRepository;

@Service
public class SirketService {

    @Autowired
    ISirketRepository sirketRepository;
    

    public Sirket sirketEkle(Sirket sirket) {
        return sirketRepository.save(sirket);
    }

    public void sirketSil(Long id) {
        sirketRepository.deleteById(id);
    }

    public Sirket sirketGuncelle(Sirket sirket) {
        return sirketRepository.save(sirket);
    }

    public List<Sirket> sirketleriListele() {
        return sirketRepository.findAll();
    }

    
}
