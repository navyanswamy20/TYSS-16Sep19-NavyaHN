package com.tyss.assetmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tyss.assetmanagementsystem.dao.AssetDAO;
import com.tyss.assetmanagementsystem.dto.AssetAllocation;
import com.tyss.assetmanagementsystem.dto.AssetStatus;
import com.tyss.assetmanagementsystem.dto.Assets;
import com.tyss.assetmanagementsystem.dto.EmployeeBean;
import com.tyss.assetmanagementsystem.dto.UsersBean;

@org.springframework.stereotype.Service
public class AssetServiceImpl implements AssetService {

	@Autowired
	private AssetDAO dao;
	
	@Override
	public boolean register(UsersBean bean) {
		return dao.register(bean);
	}


	@Override
	public UsersBean login(Integer userId, String password) {
		return dao.login(userId, password);
	}

	@Override
	public Assets addAsset(Assets asset) {
		return dao.addAsset(asset);
	}

	@Override
	public Assets removeAsset(Integer allocId) {
		return dao.removeAsset(allocId);
	}

	@Override
	public boolean updateAsset(Assets assets) {
		if (assets.getAssetName() == null || assets.getQuantity() == null || assets.getAssetDes() == null
				|| assets.getStatus() == null) {
			return false;
		}
		return dao.updateAsset(assets);
	}

	@Override
	public List<Assets> getAllAsset() {
		return dao.getAllAsset();
	}

	@Override
	public EmployeeBean addEmployee(EmployeeBean employee) {
		return dao.addEmployee(employee);
	}

	@Override
	public AssetAllocation raiseAllocation(AssetAllocation assetAllocation) {
		return dao.raiseAllocation(assetAllocation);
	}

	@Override
	public List<AssetAllocation> getAllAssetAllocation() {
		return dao.getAllAssetAllocation();
	}

	@Override
	public AssetStatus setStatus(Integer allocationId, String status) {
		return dao.setStatus(allocationId, status);
	}

	@Override
	public AssetStatus viewStatus(Integer allocationId) {
		return dao.viewStatus(allocationId);
	}

	
}
