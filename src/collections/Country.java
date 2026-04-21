package collections;
import java.util.HashMap;
import java.util.Map;

public class Country {
	

	    public static void main(String[] args) {

	        // create a map where key is country and value is capital
	        Map<String, String> map = new HashMap<>();

	        // add country and capital
	        map.put("Nepal", "Kathmandu");
	        map.put("India", "New Delhi");
	        map.put("USA", "Washington");
	        map.put("Japan", "Tokyo");

	        // loop through each entry (key and value pair)
	        for (Map.Entry<String, String> entry : map.entrySet()) {

	            // get country name (key)
	            String country = entry.getKey();

	            // get capital city (value)
	            String capital = entry.getValue();

	            // print in required format
	            System.out.println("Country: " + country + ", Capital: " + capital);
	        }
	    }
	}


