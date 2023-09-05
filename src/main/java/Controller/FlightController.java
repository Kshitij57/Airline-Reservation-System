package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Flight;
import Service.FlightService;

@RestController
@RequestMapping("cust")
public class FlightController {

	@Autowired
	private FlightService flightservice;
	
	
	@GetMapping("/getseatprice")
	public ResponseEntity<Integer> getSeatPrice(@RequestBody Integer price) {
		Flight flight = flightservice.getSeatPrice(price);
		
		return ResponseEntity.ok(price);
	}
	
	@GetMapping("/getseatno")
	public ResponseEntity<Flight> getSeatno(@RequestBody Integer number){
		Flight flight = flightservice.getSeatno(number);
		return ResponseEntity.ok(flightservice.getSeatno(number));
	}
	//public class ResponseEntity<Flight>

	@PostMapping("bookING")
	public ResponseEntity <Flight> bookticket(@RequestBody Flight book){
		Flight Book = flightservice.bookticket(book);
		return ResponseEntity.ok(flightservice.bookticket(book));
	}
	@GetMapping("/availableseat")
	public ResponseEntity <Flight> getAvailableSeat(@RequestBody Flight seat){
		Flight Seat = flightservice.getAvailableSeat(seat);
		return ResponseEntity.ok(flightservice.getAvailableSeat(seat));
	}
	@GetMapping("getallflight")
	public Iterable <Flight> getAllFlight(){
		return flightservice.getAllFlight();	}
	
	@DeleteMapping("deleteflight")
	public  ResponseEntity <Flight>  deleteticket(@RequestBody Integer ticket) {
		Flight flight = flightservice.deleteticket(ticket);
		return ResponseEntity.ok(flightservice.deleteticket(ticket));
	}
	
	public static ResponseEntity<Entity.Flight> ok(Entity.Flight flight) {
			// TODO Auto-generated method stub
			return null;
		}
//	public Flight deleteticket(Integer ticket);
}
