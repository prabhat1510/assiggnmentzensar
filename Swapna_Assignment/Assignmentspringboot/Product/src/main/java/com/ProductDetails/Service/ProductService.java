package com.ProductDetails.Service;

import java.util.List;

import com.ProductDetails.Entities.ProductDetails;

public interface ProductService {
	public  ProductDetails getproductById(Long pid);
	
	public  ProductDetails    addProductr(Product pname);
	
	public  ProductDetails updateProduct(Long pid, DESC) ;
	
	public  ProductDetails updateOrderName(Long oid, String oname);
	
	public  ProductDetails deleteOrder(Long oid);
	
   public List< ProductDetails> fetchAllProductr();
}
