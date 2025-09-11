package javaSessions;

public class DatTypesConcept {

	public static void main(String[] args) {
	//Data types
	
		//1. Primitive data types: All are reserved data types
			//Numeric type
				//Integral family
					//Integer: byte, short, int , long
					//floating: float, double
				//character: char A, @, 8, 
			//Boolean type: boolean (true/false)
		
		//1 byte= 8 bits
		
		
		//1. Byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b = 10; 
		// byte= data type
		// b = Variable name/ refarence
		// = assignmemnt operater
		// 10 is the value
		
		//byte b=20;
		b=20;
		byte b1=-10;
		System.out.println(b);
		byte b2=127;
		System.out.println(b2);
		//byte b3=128;
		byte b4=-128;
		//byte b5=12.1;
	//	byte b5=ayty; can't store any alphabets and spl characters
	
		//2. Short
		//size:2 bytes = 16 bits
		//range: -2^15 to 2^15-1 (-32768 to 32767)
		short s=25;
		System.out.println(s);
		short s1=600;
		short s2=-500;
		//short s3=200.67;
		//1000 va= 2000
		
		//3. int
		//size:4 bytes = 4x8= 32 bits
		//range: -2^31 to 2^31-1 (-2147483648 to 2147483647)
		
		int i=10000;
		int i1=50000;
		System.out.println(i);
		
		
		//4. long
		//size:8 bytes = 8x8= 64 bits
		//range: -2^63 to 2^63-1
		long l=123456789;
		long l1=123456789012L;
		System.out.println(l1);
		long l2=123456789012345678l;
		
		//Mobile number, Aadhar num, Bank account num : String
		
		//population,destence, stars in universe, youtube likes, views
		
		
		//5. float
		//size: 4 bytes : 32 bits
		//range: after decimal 6-7 digits
		float f=123.56f;
		float f1=(float)456.56f;
		System.out.println(f);
		System.out.println(f1);
		
		float f2=100;//100.0
		System.out.println(f2);
		float f3=90000000000000000000000000000000000000f;
		
		//6. double
		//size: 8 bytes : 64 bits
		//range: after decimal up to 15 digits
		
		double d=12.33;
		double d1=125;// 125.0
		System.out.println(d1);
		
		//6. character  store only one character Apla, numrics, spl char
		
		char c='q';
		System.out.println(c);
		char c1='1';//0-9
		System.out.println(c1);
		char c2='@';
		System.out.println(c2);
		//char c3=65;
		char c3=' ';
		
		//7. boolean : true/false
		//range:true/false
		//size: ~1bit
		
		boolean bb=true;
		boolean bb1=false;
		
		System.out.println(bb);
		System.out.println(bb1);
		
		byte b5=10;//100
		byte b6=20;//100
		byte b7=(byte) (b5+b6);//200
		int b8=b5=b6;
		
		
		
		//2. non primitive data types: class, interface, Arrays, Object, String

	}

}
