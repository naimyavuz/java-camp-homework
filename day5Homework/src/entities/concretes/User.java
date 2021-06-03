package entities.concretes;

import entities.abstracts.Entity;
public class User implements Entity{
	
	private int id;
	private String name; //ad ve soyad en az iki karakterden oluþmalýdýr.
	private String surname;
	private String password; //parola en az 6 karakterden oluþmalýdýr.
	private String email;
	public int userVerificationCode = (int)(Math.random()*1000000);
	
	

	public User() {
		
	}
	
	public User(int id, String name, String surname, String password, String email, int userVerificationCode) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.email = email;
		this.userVerificationCode = userVerificationCode;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUserVerificationCode() {
		return userVerificationCode;
	}

	public void setUserVerificationCode(int userVerificationCode) {
		this.userVerificationCode = userVerificationCode;
	}
}
