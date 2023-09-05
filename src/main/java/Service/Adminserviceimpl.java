package Service;

import org.springframework.beans.factory.annotation.Autowired;

import Entity.User;
import Repository.AdminRepository;

public class Adminserviceimpl implements AdminService {

	@Autowired
	private AdminRepository adminrepository;

	@Override
	public User deleteUserbyId(int id) {
		// TODO Auto-generated method stub
		return adminrepository.delete(id);
	}

	@Override
	public User getuserbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getuserflightbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
