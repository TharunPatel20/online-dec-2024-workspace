package com.demo.spring_boot_rest_collection_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring_boot_rest_collection_project.dao.ProductDaoCollectionImpl;
import com.demo.spring_boot_rest_collection_project.pojo.ProductPojo;

//@Component
@Service
public class ProductService {
	
//	ProductDaoCollectionImpl productDao = new ProductDaoCollectionImpl();
	
	@Autowired
	ProductDaoCollectionImpl productDao;
	
	public List<ProductPojo> fetchAllProducts(){
		return productDao.fetchAllProducts();
	}
	
	public ProductPojo fetchAProduct(int productId) {
		return productDao.fetchAProduct(productId);
	}
	
	public void deleteProduct(int productId) {
		productDao.deleteProduct(productId);
	}
	
	public ProductPojo addProduct(ProductPojo newProduct) {
		return productDao.addProduct(newProduct);
	}
	
	public ProductPojo updateProduct(ProductPojo editProduct) {
		return productDao.updateProduct(editProduct);
	}
}
