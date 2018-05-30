package br.com.citra.ws.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	private static EntityManagerFactory factory;

	public EntityManagerFactorySingleton() {
	}
	
	public static EntityManagerFactory getInstance(){
		
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("oracle");
		}
		return factory;
		
	}
	
	

}
