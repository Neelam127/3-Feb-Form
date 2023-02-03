package com.cg1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg1.UserRepository.UserRepository;
import com.cg1.model.User;
import com.cg1.userException.UserNotFoundException;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findUserbyName(String userName) throws UserNotFoundException {
		// TODO Auto-generated method stub
		
		List<User> user=userRepository.findAll();
		for(int i=0;i<user.size();i++) {
			User findUser=user.get(i);
			if(userName.equals(findUser.getFirstName())) {
				return findUser;
			}
		}
		throw new UserNotFoundException("User not found");
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user, String userId) {
		// TODO Auto-generated method stub
		User update=userRepository.findByuserId(userId);
		
		update.setFirstName(user.getFirstName());
		update.setLastName(user.getLastName());
		update.setPassword(user.getPassword());
		return userRepository.save(update) ;
	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub
		userRepository.deleteByuserId(userId);
		
	}

}
