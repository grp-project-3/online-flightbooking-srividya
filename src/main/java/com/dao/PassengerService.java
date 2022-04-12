package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack1.Passenger;

@Service
public class PassengerService {
	@Autowired
	PassengerDAO passengerDAOImpl;

	public void add(Passenger passenger)
	{
		passengerDAOImpl.addPassenger(passenger);
	}
	public Passenger find(int id)
	{
		return passengerDAOImpl.findPassenger(id);
	}
	//public List<Passenger> findAll()
	//{
	//	return passengerDAOImpl.findAllPassenger();
//	}
	public boolean update(Passenger passenger)
	{
		return passengerDAOImpl.updatePassenger(passenger);
	}
	public boolean delete(Passenger passenger)
	{
		return passengerDAOImpl.deletePassenger(passenger);
	}

	
	
}
