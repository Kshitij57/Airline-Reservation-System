package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	
	
	public static ResponseEntity<Entity.Flight> ok(Entity.Flight flight) {
			// TODO Auto-generated method stub
			return null;
		}
		
}
