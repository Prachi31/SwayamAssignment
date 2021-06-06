package com.practice.samagra.businessobject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.practice.samagra.entity.CourseDetail;

@Component
public class SwayamBusinessObject implements ISwayamBusinessObject{
	
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CourseDetail> fetchCourseData() {
		entityManager = getEntityManager();
		entityManager.getTransaction().begin();
		String queryString = "Select * FROM COURSE_DETAIL";
		Query query = (Query) entityManager.createNativeQuery(queryString);
		return (List<CourseDetail>) query.getResultList();
	}

	@Override
	public void persistCourseData(List<CourseDetail> cd) {
		entityManager = getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(cd);
		entityManager.getTransaction().commit();
	}
	
	public static EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.swayam.persistance_config");
	    return emf.createEntityManager();
	}
}
