package com.tyss.assetmanagementsystem.dao;

import java.util.List;

import com.tyss.assetmanagementsystem.dto.AssetAllocation;
import com.tyss.assetmanagementsystem.dto.AssetStatus;
import com.tyss.assetmanagementsystem.dto.Assets;
import com.tyss.assetmanagementsystem.dto.EmployeeBean;
import com.tyss.assetmanagementsystem.dto.UsersBean;

public interface AssetDAO {
	
	public boolean register(UsersBean bean);

	public UsersBean login(Integer userId, String password);

	public Assets addAsset(Assets asset);

	public Assets removeAsset(Integer allocId);

	public boolean updateAsset(Assets assets);

	public List<Assets> getAllAsset();

	public EmployeeBean addEmployee(EmployeeBean employee);

	 public AssetAllocation raiseAllocation(AssetAllocation assetAllocation);

	public List<AssetAllocation> getAllAssetAllocation();

	public AssetStatus setStatus(Integer allocationId, String status);

	public AssetStatus viewStatus(Integer allocationId);

}
