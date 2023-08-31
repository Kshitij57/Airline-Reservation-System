package Service;

import org.springframework.beans.factory.annotation.Autowired;

import Entity.User;
import Repository.AdminRepository;

public class Adminserviceimpl implements AdminService {

	@Autowired
	private AdminRepository adminrepository;

	
}
