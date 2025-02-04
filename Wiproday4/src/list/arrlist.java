package list;
import java.util.*;
public class arrlist {
	public static void main(String[]args) {
		ArrayList <Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(32);
		a.add(21);
		a.add(8);
		a.add(9);
		a.remove(2);
		a.set(1, 28);
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
