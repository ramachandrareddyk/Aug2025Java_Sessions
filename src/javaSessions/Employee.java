package javaSessions;

public class Employee {

	//intance variables/global variables
	String name;
	int age;
	double salary;
	char gender;
	boolean isPerm;
	
	public static void main(String[] args) {
		int i=10;//local variable
		
		//create object using new key word
		Employee obj = new Employee();
		
		//Employee: is a class
		//new : Key word to create the object
		//obj: object ref
		//new Employee(): Object/instance of the class
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.gender);
		System.out.println(obj.isPerm);
		
		System.err.println("------------");
		
		obj.name="Peter";
		obj.age=35;
		obj.salary=50000.89;
		obj.gender='M';
		obj.isPerm=true;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.gender);
		System.out.println(obj.isPerm);
		
		Employee obj1= new Employee();
		//Employee obj2= new Employee();
		
		obj1.name="Ravi";
		obj1.age=24;
		
		System.out.println(obj1.name+" "+obj1.age+" "+obj1.salary+" "+obj1.gender+" "+obj1.isPerm);
		obj1.salary=45000;
		obj1.gender='m';
		
		System.out.println(obj1.name+" "+obj1.age+" "+obj1.salary+" "+obj1.gender+" "+obj1.isPerm);
		
		//no ref objects
		new Employee().name="Tom";
		new Employee().age=34;
		
	//	System.out.println(new Employee().name);
		
		Employee e1= new Employee();
		e1=null;
		//e1.name="Mahesh";//java.lang.NullPointerException
		
		//System.out.println(e1.name);
		
		Employee e2; //local var
		e2= new Employee();
		
		System.gc();
		
		
		
	}

}
