package core.abstracts;

import entities.concretes.User;
import entities.concretes.VerificationCode;

public interface VerificationService {

	void send(User user);
	boolean verify(User user, VerificationCode verificationCode);
}
