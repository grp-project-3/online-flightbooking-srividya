package com.dao;

import org.springframework.stereotype.Repository;

import com.pack1.Passenger;

import antlr.collections.List;

@Repository
public interface PassengerDAO {

		public void addPassenger(Passenger passenger);
		public Passenger findPassenger(int id);
		//public List findAllPassenger();
		public boolean updatePassenger(Passenger passenger);
		public boolean deletePassenger(Passenger passenger);

	}
	

