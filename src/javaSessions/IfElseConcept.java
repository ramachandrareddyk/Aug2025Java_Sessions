package javaSessions;

public class IfElseConcept {

	// <, >, <=, >=, ==
	public static void main(String[] args) {
		
		
		System.out.println(10==20);
		
		int a=10;
		int b=20;
		
		if(a>b) {
			System.out.println("b is grater then a");
		}else {
			System.out.println("a is grater then b");
		}
		
		if(false) {
			System.out.println("Hello...");
		}else {
			System.out.println("Bye...");
		}
		
		boolean flag=true;
		
		if(flag) {
			System.out.println("Hello java");
		}else {
			System.out.println("Bye java...");
		}
		
		
		String str="Java";
		if(str.equals("Java")) {
			System.out.println("Both are equal....");
		}else {
			System.out.println("Both are not equal...");
		}
		
		if(10>5) {
			System.out.println("Hello java...");
		}else {
			System.out.println("Bye java");
		}
		
		//if--if--else--if
		//nested if else
		
		int marks=85;
		
		if(marks<=100) {
			
			System.out.println("Pass with "+marks);
			if(marks>=90) {
				System.out.println("GRADE A");
				if(marks>95) {
					System.out.println("100% scholarship");
					if(marks==100) {
						System.out.println("0% fee");
					}else {
						System.out.println("10% fee");
					}
				}
				
			}

		}else {
			System.out.println("INVALID MARKS");
		}
		
		
		String browser="edge";
		if(browser.equals("chrome")) {
			System.out.println("Launch chrome browser");
			
		}
		if(browser.equals("firefox")) {
			System.out.println("Launch firefox browser");
		}
		if(browser.equals("edge")) {
			System.out.println("Launch edge browser");
		}
		if(browser.equals("ie")) {
			System.out.println("Launch chrome browser");
		}else {
			System.out.println("Please pass the correct bowser name "+browser);
		}
		
		
		if(browser.equals("chrome")) {
			System.out.println("Launch chrome browser");
		}else if(browser.equals("firefox")) {
			System.out.println("Launch firefox browser");
			
		}else if(browser.equals("edge")) {
			System.out.println("Launch edge browser");
		}else if(browser.equals("ie")) {
			System.out.println("Launch ie browser");
		}else {
			System.out.println("Please pass the correct bowser name "+browser);
		}
		
		
		
		String s="Java";
		String s1="Selenium";
		//and &&
		//or ||
		if(s.equals("Java")&& s1.equals("Selenium")) {
			System.out.println("bothe are same");
		}else {
			System.out.println("bothe are not same");
		}
		
		if(s.equals("java")|| s1.equals("Selenium")) {
			System.out.println("bothe are same");
		}else {
			System.out.println("bothe are not same");
		}
		
		
	
		int h=10;
		int j=34;
		int k=0;
		int l=87;
		int z=76;
		//largest number
		//smalest number
		
		

	}

}
