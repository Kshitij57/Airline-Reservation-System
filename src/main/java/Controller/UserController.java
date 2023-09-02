package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.User;
import Service.UserService;

@RestController
@RequestMapping("/userr")
public class UserController {

	@Autowired
	private UserService userservice;

	@PostMapping("/saveuser")
	public ResponseEntity <User>saveUser (User user)throws Exception {
		return ResponseEntity.ok(userservice.saveUser(user));
		
				}

	@GetMapping("/getuser")
	public ResponseEntity<User>  getUserbyId(int id) {
		User user = userservice.getUserbyId(id);
		return ResponseEntity.ok(userservice.getUserbyId(id)); 
	}

	@PutMapping("/putuser")
	public ResponseEntity <User> setUsers(User user)  throws Exception{
		return ResponseEntity.ok(userservice.setUsers(user));
	}
	
	@DeleteMapping("/deletemapping")
	public ResponseEntity<User> deleteUserById(Integer id ) {
		User user = userservice.deleteUserById(id);
		return ResponseEntity.ok(userservice.deleteUserById(id));
     
	}
	
		
	}

