package javaSessions;

public class StringConcatenation {

	public static void main(String[] args) {

		
		//String is class: default/predefined class in java
		
		//String we will use to store group of characters
		
		String name="Ram";
		String num="1000";
		
		System.out.println(name);
		System.out.println(num);
		
		String x="Hello";
		String y="Selenium";
		
		int a=10;
		int b=20;
		
		double c=12.33;
		double d=23.12;
		
		System.out.println(a+b);//30
		System.out.println(x+y);//HelloSelenium
		System.out.println(x+a);//Hello10
		System.out.println(a+b+x);//30Hello
		System.out.println(x+a+b);//Hello1020
		System.out.println(x+(a+b));//Hello30
		
		System.out.println(x+y+a+b);//HelloSelenium1020
		System.out.println(a+b+x+y);//30HelloSelenium	
		System.out.println(x+y+(a+b));//HelloSelenium30
		
		System.out.println(a+x+y+a+b);//10HelloSelenium1020
		
		System.out.println(a+b+x+y+(a+b+c+d));//30HelloSelenium65.45
		
		String m="10";
		String n="20";
		
		System.out.println(m+n);//1020
		System.out.println(a+b+m+n);//301020
		
		System.out.println(a+b+c+d+x+y+m+n);
		System.out.println(x+y+(a+b)+m+n);//HelloSelenium301020
		
		System.out.println(x);
		System.out.println("This is m value "+m);
		
		System.out.println("The value of a is: "+a);
		System.out.println("The value of b is: "+b);
		System.out.println("The value of a+b is: "+(a+b));
		
		char ch='a';
		String str="Selenium";
		
		System.out.println(ch+str);//aSelenium
		
		char c1='a';
		char c2='b';
		System.out.println(c1);//a
		System.out.println(c1+c2);//195 a=97, b=98
		System.out.println(c2-c1);//1
		
		//ASCII: American Standard Code for Information Interchange
		
		//range: 
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		
		System.out.println('A'+'B');//65+66=131
		System.out.println(c1+c2+'0'+'A');//308
		System.out.println(str+c1+c2);//Seleniumab
		System.out.println(str+(c1+c2));//Selenium195
		
		System.out.println(c1);//a
		System.out.println((byte)c1);//ASCCI value of a
		System.out.println((byte)'@');//64
		
		System.out.println('a'+0);//97
		System.out.println('#'+0);//
		
		System.out.println('a'+10+20+30);//157
		
		System.out.println("Ram"+" Hello");
		
		System.out.println('a'+'b'+'c'+"Hello"+'9'+7);//294Hello97
		
		//An internal error has occurred and has been logged.
		
		String Act="An internal error has occurred and has been logged.";
		
		System.out.println("The Error messge while login : "+Act);
		
		boolean b1=true;
		System.out.println(b1);
		
		System.out.println(b1+str);
		
		System.out.println(b1+"Hello");
		
		System.out.println(b1+"Hello"+'A');
		
		System.out.println('A'+'B');//131  AB
		
		System.out.println("A"+"B");//AB
		
		//SendKeys("Ram");
		
		
	}

}
