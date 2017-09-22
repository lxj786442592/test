package com.lxj.ssh.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;


import com.lxj.ssh.domain.Product;

//商品管理的dao类    继承spring-orm中的hibernate模板
public class ProductDao extends HibernateDaoSupport{

	public void save(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Dao中的save方法执行了。。");
		this.getHibernateTemplate().save(product);
		String hql = "";
		this.getHibernateTemplate().find(hql);
	}

}
