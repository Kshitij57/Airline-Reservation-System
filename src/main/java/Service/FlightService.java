package Service;

import Entity.Flight;

public interface FlightService {

    public String getAvailableSeat(Flight flight);
	public Flight getSeatPrice(Integer price);
	public Flight getSeatno(Integer flight);
	
	
}
