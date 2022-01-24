package springhibernate.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import springhibernate.app.entity.User;
import springhibernate.app.repository.UserRepository;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@Override
	public void saveUser(User users) {
		userRepository.save(users);
	}
}
