package list;
import java.util.*;
public class hashmap {
	public static void main(String[]args) {
		HashMap <Integer,String> a= new HashMap();
		a.put(1001,"Ram");
		a.put(1002,"Ravi");
		a.put(1003,"Vijay");
		a.put(1004,"Ajith");
		a.put(1005,"Arun");
		System.out.println(a);
		
		if(a.containsKey(1003)) {
			System.out.println("Roll number : 1003  Name : "+a.get(1003));
		}
		else {
			System.out.println("Roll number 1003 not found");
		}
		
		if(a.containsKey(1004)) {
			a.remove(1004);
			System.out.println("Removed Roll number 1004");
		}
		else {
			System.out.println("Roll number is not found");
		}
		Iterator<Map.Entry<Integer, String>> iterator = a.entrySet().iterator();

        System.out.println("Iterating using entrySet() Iterator:");
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
		
	}
}
