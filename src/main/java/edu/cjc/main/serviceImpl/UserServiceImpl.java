package edu.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.main.model.Student;
import edu.cjc.main.model.User;
import edu.cjc.main.repository.UserRepository;
import edu.cjc.main.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	
	@Autowired
	private UserRepository ur;
	
	@Override
	public void saveUserDetails(User u) {
		

	ur.save(u);
		
	}

	@Override
	public User loginUserDetails(String username, String password) {
		User user = ur.findByUsernameAndPassword(username, password);
		return user;
	}

	@Override
	public User getSingleStudentByusernameandpassword(String username, String password) {
		
		return ur.findByUsernameAndPassword(username, password);
	}

	
}
