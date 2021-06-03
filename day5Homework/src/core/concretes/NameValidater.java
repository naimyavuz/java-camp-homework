package core.concretes;


import core.abstracts.ValidationService;
import entities.concretes.User;

public class NameValidater implements ValidationService {

	@Override
	public boolean check(User user) {
		
		if(user.getName().length() >= 2 && user.getSurname().length() >= 2) {
			System.out.println("Valid name.");
		}
		
		else {
			System.out.println("Invalid name. Your name and surname must be at least 2 characters long.");
			return false;
		}
		return false;
	}
	

}
