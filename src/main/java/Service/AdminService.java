package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import Entity.User;
import Repository.AdminRepository;

@Service
public interface AdminService {

	 User deleteUserbyId(int id);
     User getuserbyId(int id);
     User getuserflightbyId(int id);
	//public static final AdminRepository AdminRepository = new AdminRepository();

	}
	

