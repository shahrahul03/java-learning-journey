package collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
//		List<String> list = new ArrayList();
//		List<String> list = new LinkedList();
//		list.add("java");
//		list.add("python");
//		list.add("74930");
//		list.add("8904.4");
//		list.add("@");
//		System.out.println(list);
//		for(String s : list) {
//			System.out.println(s);
//		}
//		System.out.println(list.size());
//		list.remove("python");
//		System.out.println(list);
//		System.out.println(list.contains("java"));
//		System.out.println(list.get(1));
//		list.clear();
		
		Book b = new Book();
		Book b2 = new Book();
		
		List <Book> list = new LinkedList();
		b.setBookID(1);
		b.setBookName("english");
		b.setPrice(8098.4);
		b2.setBookID(2);
		b2.setBookName("java");
		b2.setPrice(55.4);
		
		list.add(b);
		list.add(b2);
		
		System.out.println(b);
		System.out.println(b2);
		System.out.println(list);
		System.out.println(list.get(1));
		
		
	}

}
