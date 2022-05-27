package com.example.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.entities.Product;
import com.example.test.exceptions.NoDataFoundException;
import com.example.test.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{


	@Autowired
	ProductRepository repository;

	@Override
	public List<Product> getAllProduct() {
		return (List<Product>) repository.findAll();
	}

	@Override
	public Product addProduct(Product products) {
		return repository.save(products);
	}

	@Override
	public Product getProduct(Integer id) throws NoDataFoundException {
		Optional<Product> adv = repository.findById(id);

		if(adv.isPresent()) {
			return adv.get();
		} else {
			throw new NoDataFoundException();
		}
	}

	@Override
	public String updateProduct(Integer id, Product advertises) throws NoDataFoundException {

		if(repository.findById(id).isPresent()) {
			Product adv = repository.findById(id).get();
			Product.setId(id);
			BeanUtils.copyProperties(products, adv);
			repository.save(adv);
			return "Updated";
		} else {
			throw new NoDataFoundException();
		}

	}

	@Override
	public List<Product> searchProduct(String query) throws NoDataFoundException {
		List<Product> ProductName = repository.findByProductName(query);
		List<Product> Description = repository.findByDescription(query);
		
		System.out.println("ProductName: "+ProductName);
		System.out.println("Description: "+Description);

		
		if(!ProductName.isEmpty()) {
			return ProductName;

		} else if(!Description.isEmpty()){

			return Description;
		} else {

			throw new NoDataFoundException();
		}

	}
}
