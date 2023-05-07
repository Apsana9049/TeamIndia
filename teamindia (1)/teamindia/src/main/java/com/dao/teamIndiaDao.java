package com.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class teamIndiaDao {
@Autowired
SessionFactory factory;


	public void teamIndia(com.Entity.teamIndia teamIndia) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(com.Entity.teamIndia.class);
		Transaction tr=session.beginTransaction();
		session.save(teamIndia);
		tr.commit();
		session.close();
	}


	public List<com.Entity.teamIndia> getplayer() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(com.Entity.teamIndia.class);
	    List<com.Entity.teamIndia>ll=	criteria.list();
		session.close();
		return ll;
	}


	public String updatePlayer(com.Entity.teamIndia teamIndia) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(com.Entity.teamIndia.class);
		Transaction tr=session.beginTransaction();
		session.update(teamIndia);
		tr.commit();
		session.close();
		return "updated successfully";
	}


	public String deletePlayer(int srno) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(com.Entity.teamIndia.class);
		Object entity=session.load(com.Entity.teamIndia.class, srno);
		Transaction tr=session.beginTransaction();
		session.delete(entity);
		tr.commit();
		session.close();
		return "deleted successfully";
	}

}
		
	


	
		
	

