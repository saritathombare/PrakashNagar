package Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class ListDemo 
{

	public static void main(String[] args) 
	{
		
		List l =  new ArrayList();
		
		l.add(0, 10);
		l.add(20);
		l.add(30);
		l.add(1, 40);
		l.add(null);
		l.add(null);
		
		
		//System.out.println(l);
		
		//Iterate all values
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
