package com.companyProject.companyProject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyProject.companyProject.model.Calisan;
import com.companyProject.companyProject.repository.ICalisanRepository;

@Service
public class CalisanService {

    @Autowired
    ICalisanRepository calisanRepository;

    public Calisan calisanEkle(Calisan calisan) {
        return calisanRepository.save(calisan);
    }

    public void calisanSil(Long id) {
        calisanRepository.deleteById(id);
    }

    public Calisan calisanGuncelle(Calisan calisan) {
        return calisanRepository.save(calisan);
    }

    public List<Calisan> calisanlariListele() {
        return calisanRepository.findAll();
    }
    
}
