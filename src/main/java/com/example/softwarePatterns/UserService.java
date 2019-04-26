package com.example.softwarePatterns;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<User>getAllUsers(){
		List<User>users = new ArrayList<>();
		userRepo.findAll().forEach(users::add);
		return users;
	}

	public User getUser(int id) {
		return userRepo.findById(id).get();
	}
	
	public User getUserName(String name) {
		return userRepo.findByName(name);
	}
	
	public User getEmail(String email) {
		return userRepo.findByEmail(email);
	}
	public void addUser(User user) {
		userRepo.save(user);
	}
	
	public void updateUser(int id, User user) {
		userRepo.save(user);
	}
	
	public void deleteUser(int id) {
		userRepo.deleteById(id);
	}
	
	
//	public void updateUser(int i, User user) {
//		// A save can update and add a User because the User has information about what
//		// it is an a repository can check if it already exists or not.
//		userRepo.save(user);
//	}
	public User register(String name, String password, String email, String address) {
		
		
		List<User>users = new ArrayList<>();
		
		userRepo.findAll().forEach(users::add);
		//int id = users.size() +1;
		User u1 = new User( name,email,password,address);
		
		
		
		//return users;
		for(int i =0; i< users.size();i++) {
			if(u1.getEmail().equals(users.get(i).getEmail()) && u1.getPassword().equals(users.get(i).getPassword())) {
				System.out.println("user exists");
				return null;
			}
			
			
		}
		System.out.println("user doesnt exist");
		//User u = this.getUserName(name);
		return u1;
			
	}
	
	public User login(String name, String password) {
		//name = "chigo";
		User u = this.getUserName(name);
		if(u != null && u.getName().equals(name) && u.getPassword().equals(password)) {
			return u;
		}
		return null;
		/*List<User>users = new ArrayList<>();
		userRepo.findAll().forEach(users::add);
		for(int i =0;i < users.size();i++) {
			if(users.get(i).getName() == name)
			{
			return "login";
			}
		}
		
		return "error";*/
	}
}
