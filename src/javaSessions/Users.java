package javaSessions;

public class Users {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
	
		Users u1= new Users();
		u1.name="Veena";
		u1.age=30;
		u1.city="BLR";
		
		Users u2= new Users();
		u2.name="Suma";
		u2.age=45;
		u2.city="HYD";
		
		
		Users u3= new Users();
		u3.name="Manoj";
		u3.age=24;
		u3.city="Pune";
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Veena
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//SUma
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//Manoj
		
		System.out.println("--------------");
		u1=u2;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//SUma
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//suma
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//Manoj
		
		System.out.println("--------------");
		u2=u3;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//suma
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//Manoj
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//Manoj
		
		System.out.println("--------------");
		u3=u1;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Suma
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//Manoj
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//suma

	}

}
