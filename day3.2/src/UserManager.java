
public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getName() + " kullan�c�s� eklendi.");
		
		
	}
	
	public void delete(User user) {
		
		System.out.println(user.getName() + " kullan�c�s� silindi.");
		
	}

	
	
	public void addMultiple(User[] users) {
		
		for(User user : users) {
			
			System.out.println(user.getName() + " kullan�c�lar� eklendi.");
		}
	}

}
