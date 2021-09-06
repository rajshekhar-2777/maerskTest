/**
 * 
 */
package com.cart.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.demo.cartDAO.CartServiceDAO;
import com.cart.demo.response.ProductResponse;


/**
 * @author RAJ
 *
 */
@RestController
@RequestMapping("/cart")
public class CartController {
	Logger log = LoggerFactory.getLogger(CartController.class);
	
	@Autowired
	private CartServiceDAO cartServiceDAO;
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductResponse> getProducts(@PathVariable("id") Long productId) {
		log.info("Inside Cart Controller :::");
		ProductResponse response = cartServiceDAO.getProducts(productId);
		log.info("respose : "+response);
		return new ResponseEntity<ProductResponse>(response, HttpStatus.OK);
	}
}
