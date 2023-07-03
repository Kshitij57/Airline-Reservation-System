package Controller;

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
	
	@GetMapping("/getseat")
	public String getAvailableSeat(@RequestBody Flight flight) {
		return null;
	}
	public ResponseEntity<Flight> getSeatPrice(@RequestBody Integer price) {
		Flight flight = flightservice.getSeatPrice(price);
		return  ResponseEntity.ok(flight);
	}
	public ResponseEntity<Flight> getSeatno(@PathVariable("id")Integer id){
		Flight flight = flightservice.getSeatno(id);
		return ResponseEntity.ok(flight);
	}
	//public class ResponseEntity<Flight>

		public static ResponseEntity<Entity.Flight> ok(Entity.Flight flight) {
			// TODO Auto-generated method stub
			return null;
		}
		
}
