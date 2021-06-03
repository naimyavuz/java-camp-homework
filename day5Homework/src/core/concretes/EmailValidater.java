package core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidater {
	
	String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	Pattern emailPat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);

	public boolean check(String email) {
		
		Matcher matcher = emailPat.matcher(email);
		
		if(matcher.matches()) {
			System.out.println("Valid email");
			return true;
		}
		
		else {
			System.out.println("Invalid email");
			return false;
			}
	
	}
}
