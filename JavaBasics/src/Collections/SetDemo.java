package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetDemo {

	public static void main(String[] args) {
		
		Set s = new HashSet(); 
		s.add(10);
		s.add(15);
		s.add(45);
		s.add(46);
		s.add(58);
		s.add(45);  //Duplicate
		s.add(45);  //Duplicate
		s.add(null);
		s.add(null);
		
		//System.out.println(s);
		
		//Iterate values
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
