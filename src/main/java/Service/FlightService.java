package Service;

import java.util.List;

import Entity.Flight;

public interface FlightService {

	public Iterable <Flight> getAllFlight();
    public Flight getAvailableSeat(Flight seat);
	public Flight getSeatPrice(Integer price);
	public Flight getSeatno(Integer number);
	public Flight bookticket(Flight book);
	public Flight deleteticket(Integer ticket);
	
}
