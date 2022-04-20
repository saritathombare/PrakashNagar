package Array;

public class SmallestElement
{
	public static void main(String[] args) 
	{  
        int [] a = new int [] {30, 11, 7, 75, 56};  
         
        int min = a[0];  
       
        for (int i = 0; i < a.length; i++) 
        {  
          
           if(a[i] <min)  
               min = a[i];  
        }  
        System.out.println("Smallest element present is: " + min);  
    }  

}
