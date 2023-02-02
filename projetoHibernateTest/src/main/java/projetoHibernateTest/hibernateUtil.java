package projetoHibernateTest;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class hibernateUtil {
	
	public static EntityManagerFactory factory = null;
	
	static {
		init();
	}
	
	
	private static void init() {
		try {
			if(factory==null) {
				factory=Persistence.createEntityManagerFactory("projetoHibernateTest");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

}
