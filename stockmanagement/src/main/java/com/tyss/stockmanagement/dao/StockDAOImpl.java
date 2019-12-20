package com.tyss.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.stockmanagement.dto.OrderInfo;
import com.tyss.stockmanagement.dto.ProductsInfo;

@Repository
public class StockDAOImpl implements StockDAO {

	@PersistenceUnit
	EntityManagerFactory entityManagerFactory = null;


	@Override
	public boolean generateBill() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductsInfo addProduct(ProductsInfo info) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(info);
			transaction.commit();
			return info;

		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return null;
	}

	@Override
	public ProductsInfo removeProduct(int pid) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "DELETE from ProductsInfo where pid=:pid";
			ProductsInfo info = entityManager.find(ProductsInfo.class, pid);
			Query query = entityManager.createQuery(jpql);
			query.setParameter("pid", pid);
			Integer i = query.executeUpdate();
			if (i > 0) {
				transaction.commit();
				return info;
			} else {

				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean modifyProducts(ProductsInfo info) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ProductsInfo info2 = manager.find(ProductsInfo.class, info.getId());
		info2.setName(info.getName());
		info2.setCategory(info.getCategory());
		info2.setCompany(info.getCategory());
		info2.setQuantity(info.getQuantity());
		info2.setPrice(info.getPrice());
		transaction.commit();
		return true;
	}

	@Override
	public List<ProductsInfo> getAllProducts() {
		
			EntityManager entityManager = null;
			try {
				entityManagerFactory = Persistence.createEntityManagerFactory("stock");
				entityManager = entityManagerFactory.createEntityManager();
				String jpql = "from ProductsInfo";
				Query query = entityManager.createQuery(jpql);
				List<ProductsInfo> productlist = query.getResultList();
				if (!productlist.isEmpty()) {
					for (ProductsInfo productsInfo : productlist) {
						System.out.println("Product Id:" + productsInfo.getId());
						System.out.println("Product name:" + productsInfo.getName());
						System.out.println("Company:" + productsInfo.getCompany());
						System.out.println("category:" + productsInfo.getCategory());
						System.out.println("quantity" + productsInfo.getQuantity());
						System.out.println("price:" + productsInfo.getPrice());
						System.out.println("*********************************");
					}
					return productlist;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			entityManager.close();
		
		return null;
	}

	@Override
	public List<ProductsInfo> searchByName(String name) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql ="from ProductsInfo where name=:name";
		TypedQuery<ProductsInfo> query = manager.createQuery(jpql,ProductsInfo.class);
		List<ProductsInfo> info=query.getResultList();
		return info;
	}
	@Override
	public OrderInfo addToCart(OrderInfo order) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(order);
			transaction.commit();
			return order;

		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return null;
	}

}
