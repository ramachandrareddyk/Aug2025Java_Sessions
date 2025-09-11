package javaSessions;

public class IncrementAndDecrementOperaters {

	public static void main(String[] args) {
		
		// ++  and --
//		int x=10;
//		x=x+5;
//		System.out.println(x);
//		//1. Post increment
//		
//		int a=1;
//		int b=a++;
//		System.out.println(a);
//		System.out.println(b);
//		
//		int c=-98;
//		int d=c++;
//		System.out.println(c);//-97
//		System.out.println(d);//-98
//		
//		int e=0;
//		int f=e++;
//		System.out.println(e);//1
//		System.out.println(f);//0
//		
//		
//		//2. Pre increment
//		
//		int g=1;
//		int h=++g;
//		
//		System.out.println(g);//2
//		System.out.println(h);//2
//		
//		int i=-100;
//		int j=++i;
//		System.out.println(i);//-99
//		System.out.println(j);//-99
//		
//		int k=50;
//		int l=++k;
//		System.out.println(k);//51
//		System.out.println(l);//51
//		
//		
//		//3. Post decrement
//		int m=2;
//		int n=m--;
//		System.out.println(m);//1
//		System.out.println(n);//2
//		
//		int o=-2;
//		int p=o--;
//		System.out.println(o);//-3
//		System.out.println(p);//-2
//		
//		//4. Pre decrement
//		int r=100;
//		int t=--r;
//		System.out.println(r);//99
//		System.out.println(t);//99
//		
//		int u=-1;
//		int v=--u;
//		System.out.println(u);//-2
//		System.out.println(v);//-2
		
		int y=11,z=22;
		int a1=y + z + y++ + z++ + ++y + ++z;
		
		System.out.println(y);
		System.out.println(z);
		System.out.println(a1);
		
		int i=0;
		int j=i++ - --i + ++i - --i;
		System.out.println(i);
		System.out.println(j);
		
		

	}

}
