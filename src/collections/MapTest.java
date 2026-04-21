package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
//		subject and marks
//		Map<String,Integer> map = new HashMap<>();
//		Map<String,Integer> map = new TreeMap<>();
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("math", 90);
		map.put("physics", 80);
		map.put("chemistry", 70);
		
		System.out.println(map);
		System.out.println(map.get("physics"));
		System.out.println(map.values());
		System.out.println(map.keySet());
		
		for(String key : map.keySet()) {
			System.out.println(key +";"+ map.get(key));
		}
	}

}
