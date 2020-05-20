package com.CSVReader.CSV;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctext = SpringApplication.run(Demo1Application.class, args);
		ProductService bean = ctext.getBean(ProductService.class);
		List<Product> product = bean.filterProduct();
		product.forEach(System.out::println);
	}

}
