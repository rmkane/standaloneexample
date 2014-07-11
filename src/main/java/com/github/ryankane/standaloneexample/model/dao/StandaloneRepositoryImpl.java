package com.github.ryankane.standaloneexample.model.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.github.ryankane.standaloneexample.model.entity.Standalone;

@Repository
@Transactional
public class StandaloneRepositoryImpl implements StandaloneRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Standalone> findAll() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Standalone");
		List<Standalone> rs = query.list();

		return rs;
	}

	public Standalone save(Standalone standalone) {
		Session session = sessionFactory.getCurrentSession();

		session.save(standalone);
		
		return standalone;
	}
}