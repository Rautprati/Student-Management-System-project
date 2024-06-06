package edu.cjc.main.service;

import java.util.List;

import edu.cjc.main.model.User;

public interface UserService {

	public void saveUserDetails(User u);

	public User loginUserDetails(String username, String password);

	public User getSingleStudentByusernameandpassword(String username, String password);

}
