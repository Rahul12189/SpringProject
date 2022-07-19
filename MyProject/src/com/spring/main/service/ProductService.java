package com.spring.main.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.util.comparator.Comparators;

import com.spring.main.model.Product;

@Service
public class ProductService  {

	public List<Product> fetchProducts(){
		
		Product p1 = new Product(1,"HP L7 Laptop",95000);
		Product p2 = new Product(2,"Lenovo ideaPad",75000);
		Product p3 = new Product(3,"Acer Nitro 5",55000);
		
		List<Product> list = Arrays.asList(p1,p2,p3);
		
		return list;
	}

	public List<Product> sortByPriceAsc(List<Product> list, String sort) {
		// TODO Auto-generated method stub
		
		if(sort.equalsIgnoreCase("ASC")) {
			list = list.stream().sorted(Comparator.comparingDouble(p->p.getPrice())).collect(Collectors.toList());
		}
		else {
			
			list = list.stream().sorted(Comparator.comparingDouble(p->p.getPrice())).collect(Collectors.toList());
			Collections.reverse(list);
		}
		return list;
	}
}
