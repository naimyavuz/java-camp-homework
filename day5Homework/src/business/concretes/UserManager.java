package business.concretes;

import java.util.ArrayList;
import java.util.List;


import business.abstracts.UserService;
import core.abstracts.LoggerService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	
	private LoggerService loggerService;
	private UserDao userDao;
	
	List<User> users = new ArrayList<>();
	
	public UserManager(UserDao userDao, LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.loggerService = loggerService;
	}
	
	
	
	@Override
	public void add(User user) {
		this.userDao.add(user);
		this.loggerService.logToSystem(user.getName() + " " + user.getSurname() + "registered succesfully to the database.");
	}



	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
	
}
