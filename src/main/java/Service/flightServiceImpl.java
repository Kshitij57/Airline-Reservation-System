package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Flight;
import Repository.FlightRepository;

@Service
public class flightServiceImpl implements FlightService {
@Autowired
private FlightRepository flighrepository;

@Override
public Iterable<Flight> getAllFlight() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Flight getAvailableSeat(Flight seat) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Flight getSeatPrice(Integer price) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Flight getSeatno(Integer number) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Flight bookticket(Flight book) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Flight deleteticket(Integer ticket) {
	// TODO Auto-generated method stub
	return null;
}




}







