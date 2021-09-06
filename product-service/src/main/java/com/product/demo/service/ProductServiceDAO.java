/**
 * 
 */
package com.product.demo.service;

import com.product.demo.dto.ProductDTO;

/**
 * @author RAJ
 *
 */
public interface ProductServiceDAO {

	ProductDTO getProducts(Long productId);

}
