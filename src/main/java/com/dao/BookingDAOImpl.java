package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.pack1.Booking;
import com.pack1.Passenger;
import com.pack1.Booking;
public class BookingDAOImpl implements BookingDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addBooking(Booking booking) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(booking);
		session.flush();
		session.getTransaction().commit();
		session.close();


	}

	@Override
	public Booking findBooking(int id) {
		Session session=sessionFactory.openSession();
		   Booking booking=session.find(Booking.class, id);
			return booking;
	}

	@Override
	public List<Booking> findAllBooking() {
		 //TODO Auto-generated method stub
	return null;
	}

	@Override
	public boolean updateBooking(Booking booking) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(booking);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteBooking(Booking booking) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.delete(booking);
		session.flush();
		session.getTransaction().commit();
		session.close();
		// TODO Auto-generated method stub
		return false;
	}

}
