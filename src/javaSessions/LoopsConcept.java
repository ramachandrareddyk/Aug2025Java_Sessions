package javaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1 to 1000
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("10");
		
		//1. while loop
		//2. for loop
		//3. do while loop
		//4. enhanced for loop
		
		//1. while loop
		//1 to 10
		
		int i=1;
		while(i<=10) {
			System.out.println(i);//12345678910
			//i++;//234567891011
			//++i;
			i=i+1;
			//break;
			
			//System.out.println(i);
		}
		System.out.println("--------------------");
		int j=1;
		while(j<=50) {//2
			System.out.println("Hello...");
			j++;//23.....50,51
		}
		
		System.out.println("----------------------");
		int k=1;
		while(k<100) {
			System.out.println(k);
			//k++;//49,50
			if(k==50) {
				System.out.println("Bye...");
				break;
			}
			k++;
			
		}
		System.out.println("----------------------");
		//10 to 1
		int l=10;
		while(l>=0) {
			System.out.println(l);
			//l--;
			//--l;
			l=l-1;
		}
		
		//2. for loop
		// 1 to 10
		System.out.println("-----------for loop-----------");
		for(int m=1;m<=10;m++) {
			System.out.println(m);
		}
		System.out.println("----------------------");
		for(byte b=1;b<=100;b++) {
			System.out.println(b);
		}
		
		//10, 20, 30, 40...100
		System.out.println("----------------------");
		for(int n=1;n<=100;n=n+10) {
			System.out.println(n);
		}
		System.out.println("----------------------");
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
		}
		System.out.println("----------------------");
		for(int ch='a';ch<='z';ch++) {
			System.out.println(ch);
		}
		//a=97
		//b=98
		//z
		
		System.out.println("----------------------");
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch+" ="+(byte)ch);
		}
		System.out.println("----------------------");
		for(double d=1.0;d<=10.0;d++) {
			System.out.println(d);
		}
		System.out.println("----------------------");
		
//		for(;;) {//true
//			System.out.println("Welcome to infi");
//		}
		
		int x=20;
		
//		while(true) {
//			System.out.println("Welcome to infi");
//		}
		//int y=20;
		
		//byte -128 to 127=256
		//h=128
		//128-256=-128
		byte h=1;
//		while(true) {
//			System.out.println(h);
//			h++;
//		}
		System.out.println("-----------do while loop-----------");
		//3. do while loop
		//1 to 10
		int o=1;
		do {
			//o++;//2
			System.out.println(o);//2
			o++;
			
			if(o==7) {
				System.out.println("Hello...");
			}
		}while(o<=10);
		
		//Print even and odd numbers 1 to 100
		//one program with if condition inside the loop
		//one program without if condition
		
		

	}

}
