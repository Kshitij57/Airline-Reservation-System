package Service;

import java.util.List;

import Entity.Flight;

public interface FlightService {

    public List getAvailableSeat(Flight flight);
	public List getSeatPrice(Integer price);
	public List getSeatno(Integer flight);
	
	
}
