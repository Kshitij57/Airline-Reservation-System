package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import Entity.User;
import Repository.UserRepository;

public class userserviiceimpl {

	@Autowired
	private UserRepository userrepository;
	
	@PostMapping("saveuser")
	public ResponseEntity<User>   saveuser(@RequestBody  User user) {
		return null;
	
		
		
		
		
	}
}
