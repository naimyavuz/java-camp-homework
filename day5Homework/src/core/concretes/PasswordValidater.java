package core.concretes;

import core.abstracts.ValidationService;
import entities.concretes.User;

public class PasswordValidater implements ValidationService {

	@Override
	public boolean check(User user) {
		
		if(user.getPassword().length() >= 6) {
			System.out.println("Valid password");
			return true;
		}
		else {
			System.out.println("Invalid password. Check the password requirments");
		}
		return false;
	}

}
