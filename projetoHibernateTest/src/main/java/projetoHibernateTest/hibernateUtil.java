package projetoHibernateTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
	public static Object getPrimaryKey(Object entidade) {
		return factory.getPersistenceUnitUtil().getIdentifier(entidade);
	}

}
