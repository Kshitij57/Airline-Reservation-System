package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Flight;

@Service
public class flightServiceImpl implements FlightService {
@Autowired
private FlightService flightservice;

@Override
public String getAvailableSeat(Flight flight) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Flight getSeatPrice(Integer price) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Flight getSeatno(Integer flight) {
	// TODO Auto-generated method stub
	return null;
}






}
