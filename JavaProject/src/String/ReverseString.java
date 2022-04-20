package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		// 1) using + (String concatanation) operator
		/*String str= "selenium";
		String reverse= "";
		int length = str.length();
		
		for (int i=length-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);*/
		
		// 2) using character array
		
		/*String str= "selenium";
		String reverse="";
		char[] a = str.toCharArray(); // converted string into array
		int length = a.length;
		
		for(int i=length-1;i>=0;i--)
		{
			reverse= reverse+a[i];
		}
		System.out.println(reverse);*/
		
		// 3) using scanner class
		
				String original,reverse="";
				Scanner sc =new Scanner(System.in);
				System.out.println("enter a string to reverse");
				original=sc.nextLine();
				int length = original.length();
				
				for(int i=length-1;i>=0;i--)
				{
					reverse=reverse+original.charAt(i);
				}
				System.out.println("reverse of entered string is :" + reverse);
		
		/*// 4) using string buffer class
		
		String str = "selenium";
		StringBuffer sb = new StringBuffer(str); //pass the string in arguments of StringBuffer Class
		System.out.println(sb.reverse());*/
		
		
		
	}

}
