package com.caannon.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.caannon.bo.ProductBo;
import com.caannon.config.CAJavaConfig;
import com.caannon.dao.ProductDao;

public class CAAnnonTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CAJavaConfig.class);
		ProductDao dao = context.getBean("productDao", ProductDao.class);
		List<ProductBo> productBos = dao.getAllProducts();
		productBos.stream().forEach(System.out::println);
	}
}
