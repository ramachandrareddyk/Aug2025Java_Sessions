package javaSessions;

public class MathematicalOperations {

	public static void main(String[] args) {
		
		System.out.println(1+2);
		
		System.out.println(2-1);
		
		System.out.println(2*2);
		
		int a=10;
		int b=20;
		System.out.println(a+b+20);
		
		System.out.println(10/2);//5
		
		System.out.println(9/2);//4
		//int/int=int
		//if any one value is decimal 
		System.out.println(9.0/2);
		System.out.println(9/2.0);
		System.out.println(9.0/2.0);
		
		//System.out.println(9/0);//java.lang.ArithmeticException
		
		System.out.println(9.0/0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		//System.out.println(0/0);//java.lang.ArithmeticException
		//System.out.println(-1/0);//java.lang.ArithmeticException
		
		System.out.println(2/9);//0
		System.out.println(0.0/0.0);//NaN - Not A Number
		System.out.println(0.0/0);//NaN
		System.out.println(0/0.0);//NaN
		
		//System.out.println(-12/0);
		System.out.println(0/9.0);
		//10/2=5
		//10%2=0
		//9%2=1
		
		System.out.println(10%2);//0
		System.out.println(9%2);//1
		
		
		System.out.println(100);//4 bytes
		System.out.println((byte)100);//1 byte
		
		System.out.println(12.45);//8 bytes
		System.out.println(12.45f);//4 bytes
		
	}

}
