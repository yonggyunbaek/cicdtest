package com.ygbaek.cicdtest.data.repository;

import com.ygbaek.cicdtest.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
