package list;

import java.util.ArrayList;

public class ListOfUsers {

	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("Rajeev",25));
		users.add(new User("John",34));
		users.add(new User("Sreve",29));
		
		for (User user : users)
			System.out.println(user + "\n");

	}

}
