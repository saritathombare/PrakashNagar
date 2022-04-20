
public class Mat {
	public static int add(int i,int j)
	{
		int r;
		r=i+j;
		return r;
	}
	public static int sub(int i,int j)
	{
		int r;
		r=i-j;
		return r;
	}
	public static void main (String[]args) {
		Mat t=new Mat();
		System.out.println("addition="+add(20,30));
		System.out.println("subtraction="+t.sub(100,25));
	}
}
