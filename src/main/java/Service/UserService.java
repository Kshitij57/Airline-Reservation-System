package Service;

import Entity.User;

public interface UserService {

	public User saveUser(User user);
	public User getUserbyId(Integer id);
	public User setUsers(User user);
	public User deleteUserById(Integer id);
	
	//public User deleteUserById(int id);
}