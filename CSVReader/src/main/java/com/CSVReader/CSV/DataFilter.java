package com.CSVReader.CSV;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class DataFilter implements IProduct {

	@Override
	public List<Product> filterProductList(List<Product> prd) {

		return prd.
				stream().
				filter(p -> p.getpPrize() >= 500.00).
				collect(Collectors.toList());
	}

}
