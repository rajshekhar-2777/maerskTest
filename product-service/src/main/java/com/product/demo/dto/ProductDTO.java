/**
 * 
 */
package com.product.demo.dto;

import java.util.Date;

import com.product.demo.model.Products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author RAJ
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
	
	private Long productId;
	private String productName;
	private Double price;
	private Long quantity;
	private Date createAt;
	private Date lastModifiedAt;
	
	public ProductDTO(Products product) {
		this.productId = product.getProductId();
		this.productName = product.getProductName();
		this.price = product.getPrice();
		this.quantity = product.getQuantity();
		this.createAt = product.getCreateAt();
		this.lastModifiedAt = product.getLastModifiedAt();
		
	}

	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantity=" + quantity + ", createAt=" + createAt + ", lastModifiedAt=" + lastModifiedAt + "]";
	}
	
	

}
