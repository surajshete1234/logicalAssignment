package com.CSVReader.CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private DataFilter datafil;
	
	public List<Product> filterProduct() throws Exception{
		
		FileReader fr = new  FileReader("Product.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		
		List<Product> prd = new ArrayList<Product>();
		while(line!=null) {
			String[] productVal = line.split(",");
			String pid = productVal[0];
			String pName = productVal[1];
			String pPrize = productVal[2];
			Product prod = new Product();
			prod.setPid(Integer.parseInt(pid));
			prod.setpName(pName);
			prod.setpPrize(Double.parseDouble(pPrize));
			prd.add(prod);
			line = br.readLine();
		}
		br.close();
		return datafil.filterProductList(prd);
	}
	
	
}
