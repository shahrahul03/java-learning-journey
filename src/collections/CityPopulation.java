package collections;

import java.util.HashMap;
import java.util.Map;

public class CityPopulation {
    public static void main(String[] args) {

        // create map: city name population
        Map<String, Integer> map = new HashMap<>();

        // add data
        map.put("Kathmandu", 1000000);
        map.put("Pokhara", 500000);
        map.put("Lalitpur", 300000);
        map.put("Biratnagar", 400000);
        
      
        // a. print all cities and population
        System.out.println("List of cities and population:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("City: " + entry.getKey() +
                               ", Population: " + entry.getValue());
        }

        // b. calculate total population
        int totalPopulation = 0;

        for (Integer population : map.values()) {
            totalPopulation += population;
        }

        System.out.println("\nTotal population: " + totalPopulation);

        // c. find city with highest population
        String maxCity = "";
        int maxPopulation = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxPopulation) {
                maxPopulation = entry.getValue();
                maxCity = entry.getKey();
            }
        }

        System.out.println("\nCity with highest population:");
        System.out.println("City: " + maxCity + ", Population: " + maxPopulation);

        // d. find city with lowest population
        String minCity = "";
        int minPopulation = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < minPopulation) {
                minPopulation = entry.getValue();
                minCity = entry.getKey();
            }
        }

        System.out.println("\nCity with lowest population:");
        System.out.println("City: " + minCity + ", Population: " + minPopulation);
    }
}
