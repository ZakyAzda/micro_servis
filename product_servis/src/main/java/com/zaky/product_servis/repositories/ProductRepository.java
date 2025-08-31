package com.zaky.product_servis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zaky.product_servis.model.Product;;

@Repository

public interface ProductRepository extends JpaRepository<Product, Long> {

}