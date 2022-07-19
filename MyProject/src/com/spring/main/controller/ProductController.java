package com.spring.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.main.model.Product;
import com.spring.main.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping("/products")
	public String ShowProducts(Model model) {
		
		List<Product> list = service.fetchProducts();
		model.addAttribute("list", list);
		return "products";
	}
	
	@RequestMapping("/sort-price")
    public String sortPrice(Model model,@RequestParam("sort") String sort) {
        List<Product> list= service.fetchProducts();
        list = service.sortByPriceAsc(list,sort);
        model.addAttribute("list", list);
        return "products";
        
    }
}
