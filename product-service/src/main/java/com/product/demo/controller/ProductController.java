/**
 * 
 */
package com.product.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.demo.dto.ProductDTO;
import com.product.demo.service.ProductServiceDAO;

/**
 * @author RAJ
 *
 */
@RestController
@RequestMapping("/products")
public class ProductController {
	Logger log = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductServiceDAO productServiceDAO;

	@GetMapping("/details/{id}")
	public ResponseEntity<ProductDTO> getProducts(@PathVariable("id") Long productId) {
		log.info("Inside Product Controller :::");
		ProductDTO productDTO = productServiceDAO.getProducts(productId);
		log.info("Product details processed successfully ::"+productDTO);
		return new ResponseEntity<ProductDTO>(productDTO, HttpStatus.OK);
	}
}
