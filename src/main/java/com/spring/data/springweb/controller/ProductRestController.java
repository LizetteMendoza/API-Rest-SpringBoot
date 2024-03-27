package com.spring.data.springweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.springweb.model.Product;
import com.spring.data.springweb.service.ProductService;


@RestController
@RequestMapping("api/v1/products")
public class ProductRestController {
	
	@Autowired
	private ProductService productService;
	
	//GET
	@GetMapping
	public List<Product> getProducts(){
		return productService.getAllProducts();
	}
	
	
	//POST
	@PostMapping
	public Product create(@RequestBody Product product) {
		return productService.createProduct(product);
	}
	
	//PUT
	@PostMapping("updateProduct/{id}")
	public Product update(@RequestBody Product product ,@PathVariable int id) {
		
		product.setId(id);
		return productService.updateProduct(product);
	}
	
	//DELETE
	@DeleteMapping("deleteProduct/{id}")
	public void delete(@PathVariable Integer id) {
		productService.deleteProduct(id);
	}
	

}
