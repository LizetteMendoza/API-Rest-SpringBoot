package com.spring.data.springweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.data.springweb.model.Product;
import com.spring.data.springweb.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRep;
	
	//Show cars
		public List<Product> getAllProducts(){
			return productRep.findAll();
		}
		
		//show a single car
		public Product getProduct(int id){
			return productRep.findById(id).get();
		}
		
		//Create car
		public Product createProduct(Product producto) {
			return productRep.save(producto);
			
		}
		
		//Edit car
		public Product updateProduct(Product producto) {
			return productRep.save(producto);
		}
		
		//Delete car
		public void deleteProduct(Integer id) {
			productRep.deleteById(id);
		}
	
}
