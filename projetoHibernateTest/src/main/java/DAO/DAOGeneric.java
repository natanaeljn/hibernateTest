package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.hibernate.Hibernate;

import projetoHibernateTest.hibernateUtil;

public class DAOGeneric<T> {
	
	private EntityManager entityManager = hibernateUtil.getEntityManager();
	
	public void salvar(T entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entidade);
		transaction.commit();
   }
	public T consultar(T entidade) {
		Object id  = hibernateUtil.getPrimaryKey(entidade);
		T e  =(T) entityManager.find(entidade.getClass(), id);
		return e ; 
		
	}
	public T consultarPorId(Long id ,Class<T> entidade) {
		
		T e  =(T) entityManager.find(entidade, id);
		return e ; 
		
	}
	public T updateMerge(T entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		T entidadeSalva = entityManager.merge(entidade);
		transaction.commit();
		
		return entidadeSalva;
   }
	
	public void deletarPorId(T entidade) {
		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Object id = hibernateUtil.getPrimaryKey(entidade);
			if(id != null) {
				entityManager.createQuery("delete from " + entidade.getClass().getName() + " where id = " + id).executeUpdate();
				entityTransaction.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<T> listaTodos(Class<T> entidade){
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		List<T> lista = entityManager.createQuery(" from " + entidade.getName()).getResultList();
		transaction.commit();
		return lista;
	}
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	

}
