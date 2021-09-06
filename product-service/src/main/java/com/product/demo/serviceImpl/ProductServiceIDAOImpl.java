/**
 * 
 */
package com.product.demo.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.product.demo.controller.ProductController;
import com.product.demo.dto.ProductDTO;
import com.product.demo.exception.ProductNotFound;
import com.product.demo.model.Products;
import com.product.demo.repository.ProductRepository;
import com.product.demo.service.ProductServiceDAO;

/**
 * @author RAJ
 *
 */
@Component
public class ProductServiceIDAOImpl implements ProductServiceDAO {
	
	Logger log = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductRepository productRepository;

	@Override
	public ProductDTO getProducts(Long productId) {
		log.info("Inside Product Service :::");
		Products products = productRepository.findById(productId).get();
		if(products == null) {
			log.error("Exception Occurred while processing the Product Service :"+productId);
			throw new ProductNotFound("Product Not found with this prouct ID : "+ productId);
		}
		ProductDTO dto = new ProductDTO(products);
		log.info("Respose processed from the product Service ::"+dto);
		return dto;
		
	}

}
