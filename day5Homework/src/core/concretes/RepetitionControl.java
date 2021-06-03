package core.concretes;

import java.util.ArrayList;

import core.abstracts.ValidationService;
import entities.concretes.User;

public class RepetitionControl implements ValidationService {
	
	ArrayList<String> emailControl = new ArrayList<String>();
	
	public  RepetitionControl(ArrayList<String> emailControl) {
		this.emailControl = emailControl;
	}
	
	public RepetitionControl() {
		
	} 

	@Override
	public boolean check(User user) {
		if(!this.emailControl.contains(user.getEmail())) {
			System.out.println(user.getEmail() + " is registered");
			
			
			return true;
		}
		else {
			System.out.println(user.getEmail() + " is already in use");
			return false;
		}
		
	}

}
