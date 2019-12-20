package com.tyss.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.stockmanagement.dao.StockDAO;
import com.tyss.stockmanagement.dto.OrderInfo;
import com.tyss.stockmanagement.dto.ProductsInfo;
@Service
public class StockServiceImpl implements StockService{
	@Autowired
private StockDAO dao;
	@Override
	public ProductsInfo addProduct(ProductsInfo info) {
		return dao.addProduct(info);
	}

	@Override
	public ProductsInfo removeProduct(int pid) {
		return dao.removeProduct(pid);
	}

	@Override
	public boolean modifyProducts(ProductsInfo info) {
		if (info.getName() == null || info.getCategory() == null || info.getCompany() == null ) {
			return false;
		}
	
		return dao.modifyProducts(info);
	}
	@Override
	public List<ProductsInfo> getAllProducts() {
		return dao.getAllProducts();
	}

	@Override
	public OrderInfo addToCart(OrderInfo order) {
		return dao.addToCart(order);
	}

	@Override
	public boolean generateBill() {
		return dao.generateBill();
	}

	@Override
	public List<ProductsInfo> searchByName(String name) {
		return dao.searchByName(name);
	}

}
