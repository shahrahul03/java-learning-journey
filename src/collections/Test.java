package collections;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		User user = new User(1, "hari", 548564646);
		User user2 = new User(2, "rahul", 548564646);
		User user3 = new User(3, "joy", 540064646);
		
		System.out.println(user);
		System.out.println(user2);
		System.out.println(user3);
		
		List <User> list = new ArrayList();
		list.add(user);
		list.add(user2);
		list.add(user3);
		
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.set(1, user3));
		
	}

}
