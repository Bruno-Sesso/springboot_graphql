/**
 * 
 */
package com.udemy.compras;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bruno.mendes.sesso
 *
 */
@RestController
@RequestMapping("api/v1/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello Api RestFull";
	}
}
