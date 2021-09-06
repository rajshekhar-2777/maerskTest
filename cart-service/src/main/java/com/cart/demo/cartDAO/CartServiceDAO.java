/**
 * 
 */
package com.cart.demo.cartDAO;

import com.cart.demo.response.ProductResponse;

/**
 * @author RAJ
 *
 */
public interface CartServiceDAO {

	ProductResponse getProducts(Long productId);

}
