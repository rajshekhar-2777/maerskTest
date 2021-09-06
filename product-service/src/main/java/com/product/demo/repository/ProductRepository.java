/**
 * 
 */
package com.product.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.demo.model.Products;

/**
 * @author USER
 *
 */
public interface ProductRepository extends JpaRepository<Products, Long>{

}
