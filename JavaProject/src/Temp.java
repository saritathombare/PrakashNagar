
public class Temp {
	public static void main(String[]args) {
		Temp t=new Temp();
		
		message("Ramesh");
		t.my_message();
		message("Rajesh");
		t.my_message();
		
	}
	public static void message (String name)
	{
		System.out.println("hello...@");
		System.out.println("world"+"\n how\t are you?"+name);
		
	}
	public void my_message()
	{
		System.out.println("i am fine .....@");
	}
}
	
