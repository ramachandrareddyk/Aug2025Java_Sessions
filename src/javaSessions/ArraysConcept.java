package javaSessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
//		int i=10;
//		i=20;
//		i=30;
		
		//Arrays
		
		//1. Static array---Size is fixed  100000
		//store only similar type of data
		
			//10000---->1000000
		//2. Dynamic Array--size is not fexed--ArrayList
		
		//1. using new keyword
		int i[] = new int[4];
		System.out.println(i[0]);//0 the default value of int, byte, short, long =0
		System.out.println(i[3]);//0
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);//10
		System.out.println(i[3]);//40
		
		int len=i.length;
		System.out.println("Lowest index ="+0);
		System.out.println("hi index= "+(len-1));
		System.out.println("The array length is="+len);
		
		//System.out.println(i[-1]);// java.lang.ArrayIndexOutOfBoundsException:
		//System.out.println(i[4]);
		
//		i[4]=50;
//		System.out.println(i[4]);
		System.out.println("------------");
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		System.out.println(Arrays.toString(i));
		
		System.out.println("------------------");
		
		int k[]=new int[10];
		System.out.println(k.length);//10
		
		k[0]=100;
		k[1]=200;
		
		System.out.println(k.length);//10
		System.out.println("------------------");
		for(int j=0;j<k.length;j++) {
			System.out.println(k[j]);//100, 200, 
		}
		System.out.println(Arrays.toString(k));

	}

}
