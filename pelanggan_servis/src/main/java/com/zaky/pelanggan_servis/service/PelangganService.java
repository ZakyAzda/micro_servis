package com.zaky.pelanggan_servis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaky.pelanggan_servis.model.Pelanggan;
import com.zaky.pelanggan_servis.repositories.PelangganRepository;

@Service

public class PelangganService {
    @Autowired
    private PelangganRepository pelangganRepository;

    public List<Pelanggan> getAllPelanggan() {
        return pelangganRepository.findAll();
    }

    public Pelanggan getPelangganById(Long id) {
        return pelangganRepository.findById(id).orElse(null);
    }

    public Pelanggan createPelanggan(Pelanggan pelanggan) {
        return pelangganRepository.save(pelanggan);
    }

    public Pelanggan updatePelanggan(Long id, Pelanggan pelanggan) {
        pelanggan.setId(id);
        return pelangganRepository.save(pelanggan);
    }

    public void deletePelanggan(Long id) {
        pelangganRepository.deleteById(id);
    }
}