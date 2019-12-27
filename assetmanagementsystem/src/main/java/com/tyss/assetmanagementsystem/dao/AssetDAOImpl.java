package com.tyss.assetmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.security.auth.login.LoginException;

import org.springframework.stereotype.Repository;

import com.tyss.assetmanagementsystem.dto.AssetAllocation;
import com.tyss.assetmanagementsystem.dto.AssetStatus;
import com.tyss.assetmanagementsystem.dto.Assets;
import com.tyss.assetmanagementsystem.dto.EmployeeBean;
import com.tyss.assetmanagementsystem.dto.UsersBean;
import com.tyss.assetmanagementsystem.exception.RaiseRequestException;
import com.tyss.assetmanagementsystem.exception.RemoveAssetException;
import com.tyss.assetmanagementsystem.exception.StatusExcpetion;

@Repository
public class AssetDAOImpl implements AssetDAO {

	@PersistenceUnit
	EntityManagerFactory entityManagerFactory = null;

	//UsersBean bean = new UsersBean();
	
	@Override
	public boolean register(UsersBean bean) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
			} catch(Exception e) {
				e.printStackTrace();
				return false;
			}

	}

	@Override
	public UsersBean login(Integer userId, String password) {
		UsersBean bean = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {

			String jpql = "from UsersBean where userId=:uId and userPassword=:pwd";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("uId", userId);
			query.setParameter("pwd", password);
			bean = (UsersBean) query.getSingleResult();
			//String resp = (String) query.getSingleResult();
			if (bean == null) {
				throw new LoginException();
			} else {
				//bean.setUserType(resp);
				return bean;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return bean;
		}

	@Override
	public Assets addAsset(Assets asset) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			//Assets assets = entityManager.find(Assets.class, asset.getAssetId());
			//if (assets != null) {
				transaction.begin();
				entityManager.persist(asset);
				transaction.commit();
				return asset;
			//}
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return null;
	}

	@Override
	public Assets removeAsset(Integer allocId) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("asset");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "DELETE from Assets where assetId=:assid";
			Assets asset = entityManager.find(Assets.class, allocId);
			Query query = entityManager.createQuery(jpql);
			query.setParameter("assid", allocId);
			Integer i = query.executeUpdate();
			if (i > 0) {
				transaction.commit();
				return asset;
			} else {

				throw new RemoveAssetException();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("null")
	@Override
	public boolean updateAsset(Assets assets) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Assets assets2 = manager.find(Assets.class, assets.getAssetId());
		assets2.setAssetName(assets.getAssetName());
		assets2.setQuantity(assets.getQuantity());
		assets2.setAssetDes(assets.getAssetDes());
		assets2.setStatus(assets.getStatus());
		transaction.commit();
		return true;
	}

	@Override
	public List<Assets> getAllAsset() {
		EntityManager entityManager = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("asset");
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from Assets";
			TypedQuery<Assets> query = entityManager.createQuery(jpql, Assets.class);
			List<Assets> list = query.getResultList();
			if (!list.isEmpty()) {
				return list;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	@Override
	public EmployeeBean addEmployee(EmployeeBean employee) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("asset");
			entityManager = entityManagerFactory.createEntityManager();
			EmployeeBean bean = new EmployeeBean();
			if (bean != null) {
				String jpql = "select deptId from DepartmentBean";
				Query query = entityManager.createQuery(jpql);
				List<Integer> li = query.getResultList();
				for (Integer emp : li) {
					if (employee.getDeptId() == emp) {
						transaction = entityManager.getTransaction();
						transaction.begin();
						entityManager.persist(employee);
						transaction.commit();
						return employee;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AssetAllocation raiseAllocation(AssetAllocation allocation) {
		EntityManager entityManager = null;
		EntityManager entityManager1 = null;
		EntityTransaction transaction = null;
		Integer min = 2000;
		Integer max = 5000;
		Integer rand = (int) ((Math.random() * ((max - min) + 1)) + min);
		allocation.setAllocationId(rand);
		try {
			AssetStatus astatus = new AssetStatus();
			entityManagerFactory = Persistence.createEntityManagerFactory("asset");
			entityManager = entityManagerFactory.createEntityManager();
			AssetAllocation assetallocation1 = entityManager.find(AssetAllocation.class, allocation.getAllocationId());
			if (assetallocation1 == null) {

				entityManager1 = entityManagerFactory.createEntityManager();
				Assets assetcheck = entityManager1.find(Assets.class, allocation.getAssetId());
				if (assetcheck != null) {
					transaction = entityManager.getTransaction();
					transaction.begin();
					entityManager.persist(allocation);
					astatus.setAllocationId(allocation.getAllocationId());
					astatus.setStatus("null");
					entityManager.persist(astatus);
					transaction.commit();
					return allocation;
				} else {

					throw new RaiseRequestException();
				}

			}

			else {

				throw new RaiseRequestException();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return null;
	}

	@Override
	public List<AssetAllocation> getAllAssetAllocation() {
		EntityManager entityManager = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("asset");
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from AssetAllocation";
			Query query = entityManager.createQuery(jpql);
			List<AssetAllocation> list = query.getResultList();
			if (!list.isEmpty()) {
				for (AssetAllocation assetallocation : list) {
					System.out.println("Allocation Id:" + assetallocation.getAllocationId());
					System.out.println("ASSET id:" + assetallocation.getAssetId());
					System.out.println("Employee Number:" + assetallocation.getEmpNo());
					System.out.println("Allocation Date:" + assetallocation.getAllocationDate());
					System.out.println("Release Date:" + assetallocation.getReleaseDate());
					System.out.println("Quantity:" + assetallocation.getQuantity());
					System.out.println("*********************************");
				}
				return list;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return null;
	}

	@Override
	public AssetStatus setStatus(Integer allocId, String status) {
		EntityManager entityManager = null;
		AssetStatus status2 = new AssetStatus();
		EntityTransaction entityTransaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("asset");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "UPDATE AssetStatus SET status=:sts WHERE allocation_ID=:allocid";

			Query query = entityManager.createQuery(jpql);
			query.setParameter("sts", status);
			query.setParameter("allocid", allocId);
			Integer i = query.executeUpdate();
			System.out.println(i);
			if (i > 0) {
				entityTransaction.commit();
				status2.setAllocationId(allocId);
				status2.setStatus(status);
				return status2;
			} else {

				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AssetStatus viewStatus(Integer allocId) {
		EntityManager entityManager = null;
		AssetStatus status = new AssetStatus();

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("asset");
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from AssetStatus where AllocationId=:allocid";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("allocid", allocId);
			List<AssetStatus> list = query.getResultList();
			for (AssetStatus astatus : list) {
				System.out.println(astatus.getAllocationId());
				if (astatus.getStatus().equals("null")) {
					status.setStatus("Status not updated till now");
					status.setAllocationId(allocId);
					return status;
				} else {
					String count = astatus.getStatus();
					status.setStatus(count);
					status.setAllocationId(allocId);
					return status;
				}
			}

			throw new StatusExcpetion();
		} catch (Exception e) {

			e.printStackTrace();
		}
		status.setStatus("Unallocated");
		status.setAllocationId(allocId);
		return status;
	}

	

}
