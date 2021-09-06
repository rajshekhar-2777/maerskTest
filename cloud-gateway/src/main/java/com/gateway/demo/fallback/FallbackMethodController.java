/**
 * 
 */
package com.gateway.demo.fallback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RAJ
 *
 */
@RestController
public class FallbackMethodController {
	
	@GetMapping("/cartServiceFallbackMethod")
	public String cartServiceFallbackMethod() {
		return "Cart service taking longer time than the expected.. "
				+ "Please try again later..";
	}
	
	@GetMapping("/productServiceFallbackMethod")
	public String productServiceFallbackMethod() {
		return "Product service taking longer time than the expected.. "
				+ "Please try again later..";
	}
	

}
