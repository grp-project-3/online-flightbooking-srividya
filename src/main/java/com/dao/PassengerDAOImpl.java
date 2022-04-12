package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List.*;
import com.pack1.Passenger;

//import antlr.collections.List;

public class PassengerDAOImpl implements PassengerDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(passenger);
		session.flush();
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public Passenger findPassenger(int id) {
		Session session=sessionFactory.openSession();
	   Passenger passenger=session.find(Passenger.class, id);
		// TODO Auto-generated method stub
		return passenger;
	}
	
	
	@Override
	public boolean updatePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(passenger);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	
	}

	@Override
	public boolean deletePassenger(Passenger passenger) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.delete(passenger);
		session.flush();
		session.getTransaction().commit();
		session.close();
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
	

