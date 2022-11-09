package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@GetMapping("/list")
	public List<String> getProductList() {
		List<String> list = new ArrayList<>();
		list.add("mobile");
		list.add("laptop");
		return list;
	}

	// to view this list we have to search on web 
	// http://localhost:8083/product/list

}
