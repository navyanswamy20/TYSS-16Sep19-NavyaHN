package com.tyss.assetmanagementsystem.service;

import java.util.List;

import com.tyss.assetmanagementsystem.dto.AssetAllocation;
import com.tyss.assetmanagementsystem.dto.AssetStatus;
import com.tyss.assetmanagementsystem.dto.Assets;
import com.tyss.assetmanagementsystem.dto.EmployeeBean;
import com.tyss.assetmanagementsystem.dto.UsersBean;

public interface AssetService {
	
	public boolean register(UsersBean bean);

	UsersBean login(Integer userId, String password);

	Assets addAsset(Assets asset);

	Assets removeAsset(Integer allocId);

     public boolean updateAsset(Assets assets);

	List<Assets> getAllAsset();

	EmployeeBean addEmployee(EmployeeBean employee);

	AssetAllocation raiseAllocation(AssetAllocation assetAllocation);

	List<AssetAllocation> getAllAssetAllocation();

	AssetStatus setStatus(Integer allocationId, String status);

	AssetStatus viewStatus(Integer allocationId);

}
