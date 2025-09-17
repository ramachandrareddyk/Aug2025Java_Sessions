package javaSessions;

import java.util.Arrays;

public class StaticArrayConcept {

	public static void main(String[] args) {
		int i[] = new int[4];
		System.out.println(i[0]);//0 the default value of int, byte, short, long =0
		System.out.println(i[3]);//0
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("--------------");
		for(int e:i) {
			System.out.println(e);
			if(e==30) {
				System.out.println("Hello...");
			}else {
				System.out.println("Bye....");
			}
		}
		System.out.println("--------------");
		double d[]= new double[5];
		d[0]=11.12;
		d[1]=23.44;
		d[2]=45.44;
		d[3]=56.78;
		
		//System.out.println(d);
		System.out.println(d[0]);//11.12
		System.out.println(d[4]);//0.0
		System.out.println("--------------");
		
		for(double e:d) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(d));
		
		System.out.println("--------------");
		
		char ch[]= new char[5];
		ch[0]='a';
		ch[1]='A';
		ch[2]='3';
		ch[3]='$';
		
		System.out.println(ch[4]);
		for(char e:ch) {
			System.out.println(e);
		}
		
		for(int k=0;k<ch.length;k++) {
			System.out.println(ch[k]);
		}
		
		System.out.println(Arrays.toString(ch));
		
		System.out.println("--------------");
		String names[]= new String[6];
		names[0]="Tharun";
		names[1]="Lahari";
		names[2]="Chnadana";
		names[3]="Haritha";
		names[4]="Kushitha";
		
		System.out.println(names[5]);//null
		System.out.println(names[1]);
		System.out.println("--------------");
		for(int j=0;j<names.length;j++) {
			System.out.println(names[j]);
		}
		System.out.println("--------------");
		
		for(String e:names) {
			System.out.println(e);
			if(e.equals("Tharun")) {
				System.out.println("He is a Admin");
				break;
			}
		}
		
		//emp data
		//name-String
		//salary-Double
		//id-int
		//gender-Char
		//status-bool
		
		//Object array
		System.out.println("--------------");
		Object data[]=new Object[5];
		data[0]="Tharun";
		data[1]=34500.89;
		data[2]=100076;
		data[3]='M';
		data[4]=true;
		
		System.out.println(data[0]);
		
		for(Object e:data) {
			System.out.println(e);
		}
		System.out.println("--------------");
		//Array literal
		String citys[]= {"Banglore", "Hyd", "Pune","goa"};
		System.out.println(citys.length);
		System.out.println(citys[3]);
		
		for(String e:citys) {
			System.out.println(e);
		}
		
		int numbers[]= {100,200,300,400,500};
		char ch1[]= {'a','A','#','2'};
		
		int x[]= new int[4];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		
		//10, 20, 30, 40
		//40, 30, 20, 10
		System.out.println("--------------");
		for(int j=x.length-1; j>=0; j--) {
			System.out.println(x[j]);
		}
		
		
	}

}
