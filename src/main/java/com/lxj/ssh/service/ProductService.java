package com.lxj.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.lxj.ssh.dao.ProductDao;
import com.lxj.ssh.domain.Product;

//商品管理的业务类
@Transactional
public class ProductService {
	private ProductDao productDao;

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void save(Product product) {
		System.out.println("Service中的save方法执行了。。");
		productDao.save(product);
		// TODO Auto-generated method stub
		
	}
	
}
