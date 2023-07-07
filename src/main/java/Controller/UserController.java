package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.UserService;

@RestController
@RequestMapping("/userr")
public class UserController {

	@Autowired
	private UserService userservice;
	
	
}
