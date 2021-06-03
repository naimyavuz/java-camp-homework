package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class XYZUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("User " + user.getName() + " " + user.getSurname() + " XYZ ile başarıyla eklendi.");
	}

	@Override
	public void delete(User user) {
		System.out.println("User " + user.getName() + " " + user.getSurname() + " XYZ ile başarıyla silindi.");		
	}

	@Override
	public void update(User user) {
		System.out.println("User " + user.getName() + " " + user.getSurname() + " XYZ ile başarıyla güncellendi.");		
	}

	@Override
	public User get(int id) {
		return null;
	}

	@Override
	public List<User> getAll() {
		return null;
	}

	
}
