package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import Entity.User;
import Repository.UserRepository;

@Service
public class userserviiceimpl implements UserService{

	@Autowired
	private UserRepository userrepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		retrun userservi
	}

	@Override
	public User getUserbyId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User setUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	}
	

	
	

