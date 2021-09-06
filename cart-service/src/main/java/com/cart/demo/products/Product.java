/**
 * 
 */
package com.cart.demo.products;

import java.util.Date;

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
public class Product {
	
	private Long productId;
	private String productName;
	private Double price;
	private Long quantity;
	private Date createAt;
	private Date lastModifiedAt;
	


	/**
	 * @param productId
	 * @param productName
	 * @param price
	 * @param quantity
	 * @param createAt
	 * @param lastModifiedAt
	 */
	public Product(Long productId, String productName, Double price, Long quantity, Date createAt,
			Date lastModifiedAt) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.createAt = createAt;
		this.lastModifiedAt = lastModifiedAt;
	}



	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantity=" + quantity + ", createAt=" + createAt + ", lastModifiedAt=" + lastModifiedAt + "]";
	}



	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}



	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}



	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}



	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}



	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}



	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}



	/**
	 * @return the quantity
	 */
	public Long getQuantity() {
		return quantity;
	}



	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}



	/**
	 * @return the createAt
	 */
	public Date getCreateAt() {
		return createAt;
	}



	/**
	 * @param createAt the createAt to set
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}



	/**
	 * @return the lastModifiedAt
	 */
	public Date getLastModifiedAt() {
		return lastModifiedAt;
	}



	/**
	 * @param lastModifiedAt the lastModifiedAt to set
	 */
	public void setLastModifiedAt(Date lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}
	
	
	
	
	

}
