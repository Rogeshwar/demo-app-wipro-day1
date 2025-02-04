package list;
import java.util.*;
public class hashset {
	public static void main(String[]args) {
		HashSet <String> b=new HashSet<String>();
		b.add("Chennai");
		b.add("Chengalpattu");
		b.add("Avadi");
		b.add("Tiruvallur");
		b.add("Chengalpattu");
		System.out.println(b);
		Iterator itr=b.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		boolean c=b.contains("Chennai");
		if(c) {
			System.out.println("It contains Chennai");
		}
		else  {
			System.out.println("It not contains Chennai");
		}
		b.remove("Avadi");
		Iterator itr1=b.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}

}
