
public class Empl {

public class Employee {
	//create variable to store name, age and salary
	public String name;
	public int age, sal;
	public void main (String[]args)
	{ 
		//As the variable created are non static we need object of class to use that 
		//3 object for three employees
		Employee a = new Employee();
		Employee b = new Employee();
		Employee c = new Employee();
		// initialize the variable using object
		// employee a
		 a.name = "Ravi";
		 a.age = 31;
		 a.sal = 25000;
		 // employee b
		 b.name = "Ravi";
		 b.age = 33;
		 b.sal = 35000;
		 // employee c
		 c.name = "Ravi";
		 c.age = 38;
		 c.sal = 45000;
		 // create variable to store average salary and average age 
		 int avgage, avgsal;
		 //calculate average 
		 avgage = (a.age+b.age+c.age)/3;
		 avgsal = (a.sal+b.sal+c.sal)/3;
		// display average salary and avearage age
		 System.out.println("Average Age of Employee ="+avgage);
		 System.out.println("average salary of employee= "+avgsal);
				}
	

}


}
