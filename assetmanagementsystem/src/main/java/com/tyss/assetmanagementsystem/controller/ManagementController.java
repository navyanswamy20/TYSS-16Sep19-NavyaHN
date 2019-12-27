package com.tyss.assetmanagementsystem.controller;

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

import com.tyss.assetmanagementsystem.dto.AssetAllocation;
import com.tyss.assetmanagementsystem.dto.AssetResponse;
import com.tyss.assetmanagementsystem.dto.AssetStatus;
import com.tyss.assetmanagementsystem.dto.Assets;
import com.tyss.assetmanagementsystem.dto.EmployeeBean;
import com.tyss.assetmanagementsystem.dto.UsersBean;
import com.tyss.assetmanagementsystem.service.AssetService;

@RestController
@RequestMapping("/assetmanagement")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ManagementController {

	@Autowired
	private AssetService service;
	
	@PostMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse register(@RequestBody UsersBean user) {
	AssetResponse response = new AssetResponse();
	boolean bean = service.register(user);
	if(bean != false) {
		response.setStatusCode(201);
		response.setMessage("registered");
		response.setDescription("Registered successfully pls Login");
	}else {
		response.setStatusCode(401);
		response.setMessage("not registered");
		response.setDescription("Failure");
	}
	return response;
	}

	@PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse login(@RequestBody UsersBean user) {
		AssetResponse response = new AssetResponse();
		UsersBean bean = service.login(user.getUserId(), user.getUserPassword());
		if (bean!=null && bean.getUserPassword().equals(user.getUserPassword())) {
			String userType = bean.getUserType();
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Login successfully");
			// response.setBean(bean1);
			response.setUserType(userType);
		} else {
			response.setStatusCode(401);
			response.setMessage("unsuccess");
			response.setDescription("Invalid credentials");
//			response.setUserType(null);
		}
		return response;
	}

	@PostMapping(path = "/addAsset", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse addAsset(@RequestBody Assets asset) {
		Assets check = service.addAsset(asset);
		AssetResponse response = new AssetResponse();
		if (check != null) {
			response.setStatusCode(201);
			response.setMessage("added");
			response.setDescription("asset successfully added");
		} else {
			response.setStatusCode(401);
			response.setMessage("not added");
			response.setDescription("asset not added");
		}
		return response;
	}

	@PutMapping(path = "/updateAsset/{assetId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse updateAsset(@RequestBody Assets asset, @PathVariable("assetId") int id) {
		AssetResponse response = new AssetResponse();
		if (service.updateAsset(asset)) {
			response.setStatusCode(201);
			response.setMessage("updated");
			response.setDescription("assetData successfully updated");
		} else {
			response.setStatusCode(401);
			response.setMessage("notupdated");
			response.setDescription("assetData not updated ");

		}

		return response;
	}

	@GetMapping(path = "/allasset", produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse getAllDetails() {
		AssetResponse response = new AssetResponse();
		List<Assets> assets = service.getAllAsset();
		if (!assets.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data fond in db");
			response.setAssets(assets);
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("no data found ");
		}
		return response;
	}

	@PostMapping(path = "/addemployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse addEmployee(@RequestBody EmployeeBean bean) {
		EmployeeBean employee = service.addEmployee(bean);
		AssetResponse response = new AssetResponse();
		if (employee != null) {
			response.setStatusCode(201);
			response.setMessage("employeeadded");
			response.setDescription("Employee added succeessfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("notadded");
			response.setDescription("Employee not added ");
		}
		return response;
	}

	@GetMapping(path = "/allassetallocation", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AssetAllocation> getAllAssetAllocationService() {
		List<AssetAllocation> ls = service.getAllAssetAllocation();
		if (ls != null) {
			return ls;
		} else
			return null;

	}

	@PutMapping(path = "/setstatus", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetStatus setStatusService(@RequestBody AssetStatus assetstatus) {

		AssetStatus assetstatus1 = service.setStatus(assetstatus.getAllocationId(), assetstatus.getStatus());
		if (assetstatus1 != null)
			return assetstatus1;
		else
			System.out.println("test");
		return null;

	}

	@PostMapping(path = "/raiseReq", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetAllocation serviceRaiseReq(@RequestBody AssetAllocation assetallocation) {
		AssetAllocation asstallocation = service.raiseAllocation(assetallocation);
		if (asstallocation != null)
			return asstallocation;
		else
			System.out.println("test");
		return null;
	}

	@DeleteMapping(path = "/delete/{assetId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse removeAsset(@PathVariable("assetId") int id) {
		Assets assets = service.removeAsset(id);
		AssetResponse response = new AssetResponse();
		if (assets != null) {
			response.setStatusCode(201);
			response.setMessage("deleted");
			response.setDescription("assetData deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("not deleted");
			response.setDescription("assetData not deleted");
		}
		return response;
	}

	@PostMapping(path = "/viewstatus", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetStatus viewStatusService(@RequestBody AssetStatus assetstatusobject) {

		AssetStatus assetstatuscheck = service.viewStatus(assetstatusobject.getAllocationId());
		if (assetstatuscheck != null)
			return assetstatuscheck;
		else
			return null;
	}

}
