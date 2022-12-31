package com.tns.placement.repository;

import javax.persistence.EntityManager;

import com.tns.placement.entities.User;

public class UserRepoImpl implements UserRepo {
	private EntityManager entityManager;
	public UserRepoImpl() {
	entityManager = JPAUtil.getEntityManager();

}
	@Override
	public void addNewUser(User user) {
		entityManager.persist(user);
		
	}
	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
		
	}
	@Override
	public boolean deleteUser(long id) {
		entityManager.merge(id);
		return true;
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
