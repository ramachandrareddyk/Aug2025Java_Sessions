package javaSessions;

import java.util.Arrays;

public class Student {
	
	String name;
	int Class;
	int age;
	String subjects[];
	

	public static void main(String[] args) {
		Student s1= new Student();
		s1.name="Shiva";
		s1.Class=5;
		s1.age=10;
		s1.subjects=new String[4];
		
		s1.subjects[0]="English";
		s1.subjects[1]="Kanada";
		s1.subjects[2]="Math";
		s1.subjects[3]="Hindi";
		
		System.out.println(s1.name);
		
		System.out.println(s1.name+" "+s1.Class+" "+s1.age+Arrays.toString(s1.subjects));
		System.out.println(Arrays.toString(s1.subjects));

	}

}
