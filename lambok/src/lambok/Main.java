package lambok;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User();
		user.setId(1);
		user.setName("sunny");
		user.setAddress("ujjain");
				
		System.out.println(user.getName());
		System.out.println(user.getId());
		System.out.println(user.getAddress());
		
       System.out.println(user);
		
	}

}
