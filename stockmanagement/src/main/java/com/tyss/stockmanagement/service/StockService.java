package com.tyss.stockmanagement.service;

import java.util.List;

import com.tyss.stockmanagement.dto.OrderInfo;
import com.tyss.stockmanagement.dto.ProductsInfo;

public interface StockService {
	public ProductsInfo addProduct(ProductsInfo info);

	public ProductsInfo removeProduct(int pid);

	public boolean modifyProducts(ProductsInfo info);

	public OrderInfo addToCart(OrderInfo order);

	public boolean generateBill();
	public List<ProductsInfo> getAllProducts();
	public List<ProductsInfo> searchByName(String name);
}
