package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

    public static void main(String[] args) {

        // ✅ Creating Student Objects
        Student student1 = new Student("hari", 1);
        Student student2 = new Student("rahul", 2);
        Student student3 = new Student("ram", 3);

        // ✅ Map Declaration
        // Key = Integer (roll number)
        // Value = Student Object
         Map<Integer, Student> map = new HashMap<>(); // unordered
//        Map<Integer, Student> map = new LinkedHashMap<>(); // maintains insertion order

        // Adding elements into Map
        map.put(1, student1);
        map.put(2, student2);
        map.put(3, student3);

        // Get value using key
        System.out.println("Get Student with key 1: " + map.get(1));

        // If key not found, returns null
        System.out.println("Get Student with key 10: " + map.get(10));

        // Check if key exists
        System.out.println("Contains key 2? " + map.containsKey(2));

        // Check if value exists
        System.out.println("Contains value student1? " + map.containsValue(student1));

        // Get all keys
        System.out.println("Keys: " + map.keySet());

        // Get all values
        System.out.println("Values: " + map.values());

        // Loop using keySet()
        System.out.println("\n--- Iterating using keySet ---");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        //   way to use Loop using entrySet() (Recommended)
        System.out.println("\n--- Iterating using entrySet ---");
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ✅ Remove element
        map.remove(2);
        System.out.println("\nAfter removing key 2: " + map);

        // ✅ Replace value
        map.put(1, new Student("UpdatedName", 1));
        System.out.println("\nAfter updating key 1: " + map);
        
//        update value
        map.put(2, new Student("shyam",2));
        System.out.println(" updating key 2:"+ map);

        // ✅ Size of map
        System.out.println("\nSize of map: " + map.size());

        // ✅ Clear map
        // map.clear();
        // System.out.println("Map after clear: " + map);
    }

    private int rollNo;
    private String name;

    // Constructor
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    //toString() method for printing object
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + "]";
    }
}