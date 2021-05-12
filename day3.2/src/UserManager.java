
public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getName() + " kullanıcısı eklendi.");
		
		
	}
	
	public void delete(User user) {
		
		System.out.println(user.getName() + " kullanıcısı silindi.");
		
	}

	
	
	public void addMultiple(User[] users) {
		
		for(User user : users) {
			
			System.out.println(user.getName() + " kullanıcıları eklendi.");
		}
	}

}
