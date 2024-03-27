package com.spring.data.springweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.data.springweb.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
