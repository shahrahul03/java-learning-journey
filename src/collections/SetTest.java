package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
//		Set <String> set = new HashSet<>();
//		Set <String> set = new TreeSet<>();
		Set <String> set = new LinkedHashSet<>();
		set.add("python");
		set.add("c++");
		set.add("java");
		set.add("html");
		set.add("css");
		set.add("c++");
		set.add("python");
		set.add("java");
		
		System.out.println(set);
	}
}

// create set of 
//a. user
//b.car
//c.products