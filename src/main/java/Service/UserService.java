package Service;

import Entity.User;

public interface UserService {

	public User saveUser(User user);
	public User getUserbyId(int id);
	public User setUsers(User user);
	
}