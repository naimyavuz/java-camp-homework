package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	
	public void add(User user);
	List<User> getAll();
}
