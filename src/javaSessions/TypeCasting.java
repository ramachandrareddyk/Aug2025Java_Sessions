package javaSessions;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//byte--->short--->int--->long
		
		//long---?int--->short---->byte
		
		byte b=10;
		
		short s=b;
		System.out.println(s);
		
		short s1=200;
		System.out.println(s1);//200
		byte b1=(byte) s1;// -128 to 127=256
		//128+128=256
		System.out.println(b1);//-56
		
		short s2=10;
		byte b2=(byte) s2;
		System.out.println(b2);//10
		
		byte b3=10;
		int i=b3;
		System.out.println(i);
		
		int i1=1000;
		byte b4=(byte) i1;
		System.out.println(b4);//-24
		//1000-256=744-256=488-256=232-256=-24
		
		int p=100;
		float f=p;
		System.out.println(f);//100.0
		
		float f1=12.34f;
		int p1=(int) f1;
		System.out.println(p1);//12
		
		int p3=10000;
		double d=p3;
		System.out.println(d);//10000.0
		
		double d1=45.89;
		int p4=(int) d1;
		System.out.println(p4);//45
		
		char ch='a';
		int p5=ch;
		System.out.println(p5);//97
		
		int p6=97;
		char c=(char) p6;
		System.out.println(c);//a
		
		int p7=1000;
		char c1=(char)p7;
		System.out.println(c1);//Ϩ
		

	}

}
