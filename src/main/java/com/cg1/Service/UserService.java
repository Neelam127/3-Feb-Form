package com.cg1.Service;

import java.util.List;

import com.cg1.model.User;
import com.cg1.userException.UserNotFoundException;

public interface UserService {

	List<User> findAllUser();
	
	User findUserbyName(String userName) throws UserNotFoundException;
	
	User addUser(User user);
	
	User updateUser(User user,String userId);
	
	void deleteUser(String userId);
	
	
	
}
