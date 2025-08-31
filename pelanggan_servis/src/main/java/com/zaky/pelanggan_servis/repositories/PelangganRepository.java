package com.zaky.pelanggan_servis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zaky.pelanggan_servis.model.Pelanggan;;

@Repository

public interface PelangganRepository extends JpaRepository<Pelanggan, Long> {

}