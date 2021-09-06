/**
 * 
 */
package com.cart.demo.cartDAOImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.cart.demo.cartDAO.CartServiceDAO;
import com.cart.demo.controller.CartController;
import com.cart.demo.exception.ProductNotFound;
import com.cart.demo.products.Product;
import com.cart.demo.response.ProductResponse;

/**
 * @author USER
 *
 */

@Component
public class CartServiceDAOImpl implements CartServiceDAO {
	Logger log = LoggerFactory.getLogger(CartServiceDAOImpl.class);

	@Autowired
	private RestTemplate restTemplate;
	
	@Value(value = "$product.url")
	private String url;
	
	private final static String product_error = "PRODUCT NOT FOUND";

	@Override
	public ProductResponse getProducts(Long productId) {
		log.info("Inside Cart Service :::");
		ProductResponse productResponse = productHelper(productId);
		if(productResponse == null) {
			log.info("error occurred while processing the cart service :");
			throw new ProductNotFound(product_error);
		}
		log.info("response processed successfully :"+productResponse);
		return productResponse;
	}

	private ProductResponse productHelper(Long id) {
		log.info("Inside Product Helper method:::");
		String productUrl = url+id;
		Product response = restTemplate.getForObject(productUrl, Product.class);
		ProductResponse productResponse = new ProductResponse();
		productResponse.setProductId(response.getProductId());
		productResponse.setProductName(response.getProductName());
		productResponse.setQuantity(response.getQuantity());
		productResponse.setPrice(response.getPrice());
		productResponse.setCreateAt(response.getCreateAt());
		productResponse.setLastModifiedAt(response.getLastModifiedAt());
		log.info("response processed successfully :::"+productResponse);
		return productResponse;
		
	}
}
