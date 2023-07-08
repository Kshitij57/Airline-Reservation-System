package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.User;
import Service.UserService;

@RestController
@RequestMapping("/userr")
public class UserController {

	@Autowired
	private UserService userservice;

	public User saveUser(User user) {
		return userservice.saveUser(user);
	}

	public ResponseEntity<User>  getUserbyId(int id) {
		User user = userservice.getUserbyId(id);
		return ResponseEntity.ok().body(user);
	}

	public User setUsers(User user) {
		return userservice.setUsers(user);
	}
	
	
}
