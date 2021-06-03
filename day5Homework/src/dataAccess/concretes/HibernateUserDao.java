package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("User " + user.getName() + " " + user.getSurname() + " Hibernate ile ba�ar�yla eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("User " + user.getName() + " " + user.getSurname() + " Hibernate ile ba�ar�yla silindi.");		
	}

	@Override
	public void update(User user) {
		System.out.println("User " + user.getName() + " " + user.getSurname() + " Hibernate ile ba�ar�yla g�ncellendi.");		
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
