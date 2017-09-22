package com.lxj.ssh.action;

import com.lxj.ssh.domain.Product;

import com.lxj.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

//商品管理的Action类

public class ProductAction extends ActionSupport implements ModelDriven<Product> {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	模型驱动使用的类
	private Product product = new Product();
	
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	
//	Struts和Spring整合过程中通过插件包按名称自动注入业务层的类
	private ProductService productService;
	
	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public String save(){
		System.out.println("Action中的save方法执行了。。");

		productService.save(product);
		
		return NONE;
		
	}


}	
