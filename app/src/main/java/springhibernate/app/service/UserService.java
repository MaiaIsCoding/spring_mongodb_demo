package springhibernate.app.service;

import java.util.List;

import springhibernate.app.entity.User;

public interface UserService {
	
	public List<User> getAllUsers();
	
	public void saveUser(User users);
}
