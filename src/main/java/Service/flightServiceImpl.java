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
public List getAvailableSeat(Flight flight) {
	// TODO Auto-generated method stub
	return flighrepository.findAll();
}

@Override
public List getSeatPrice(Integer price) {
	// TODO Auto-generated method stub
	return flighrepository.findAll();
}

@Override
public List getSeatno(Integer flight) {
	// TODO Auto-generated method stub
	return flighrepository.findAll();
}


}







