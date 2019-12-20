package com.tyss.stockmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tyss.stockmanagement.dto.OrderInfo;
import com.tyss.stockmanagement.dto.ProductsInfo;
import com.tyss.stockmanagement.dto.StockResponse;
import com.tyss.stockmanagement.service.StockService;

@RestController
@RequestMapping("/stockmanagement")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StockController {
	@Autowired
	private StockService service;

	@PostMapping(path = "/addProduct", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse addProduct(@RequestBody ProductsInfo info) {
		ProductsInfo check = service.addProduct(info);
		StockResponse response = new StockResponse();
		if (check != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("product successfully added");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("product not added");
		}
		return response;
	}

	@PutMapping(path = "/modify/{pid}", 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse modifyProducts(@RequestBody ProductsInfo info, @PathVariable("pid") int pid) {
		StockResponse response = new StockResponse();
		if (service.modifyProducts(info)) {
			response.setStatusCode(201);
			response.setMessage("updated");
			response.setDescription("successfully updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("notupdated");
			response.setDescription("not updated ");

		}

		return response;
	}

	@DeleteMapping(path = "/remove/{pid}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse removeAsset(@PathVariable("pid") int pid) {
		ProductsInfo info = service.removeProduct(pid);
		StockResponse response = new StockResponse();
		if (info != null) {
			response.setStatusCode(201);
			response.setMessage("deleted");
			response.setDescription("Product deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("not deleted");
			response.setDescription("Productnot deleted");
		}
		return response;
	}
	
	@GetMapping(path = "/allproducts", produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse getAllProducts() {
		StockResponse response = new StockResponse();
		List<ProductsInfo> info = service.getAllProducts();
		if (!info.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data fond in db");
			response.setProductInfo(info);
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("no data found ");
		}
		return response;
	}
	
	@GetMapping(path = "/findbyname/{name}",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse searchByName(@RequestBody ProductsInfo info, @PathVariable("name") String name) {
		StockResponse response = new StockResponse();	
		List info1 = service.searchByName(name);
		if(!info1.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("requested asset found in db ");
			response.setProductInfo(info1);
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("requested asset not found in db");
		}
		return response;
	}
	
	@PostMapping(path = "/addtocart",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse bookAsset(@RequestBody OrderInfo order) {
		StockResponse response = new StockResponse();
		if(service.addToCart(order)!=null) {
			response.setStatusCode(201);
			response.setMessage("added");
			response.setDescription("product added to cart");
		} else {
			response.setStatusCode(401);
			response.setMessage("notadded");
			response.setDescription("not added to cart ");
		}
		return response;
	}
	
}
