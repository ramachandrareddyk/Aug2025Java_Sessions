package DynamicArray;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());//0
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());//4
		
		ar.add(500);
		
		ar.add("Mahesh");
		ar.add('M');
		ar.add(345.90);
		System.out.println(ar.size());//5
		
		System.out.println(ar.get(0));//100
		//System.out.println(ar.get(6));//java.lang.IndexOutOfBoundsException
		
		System.out.println("=============");
		System.out.println(ar.get(3));//400
		
		ar.remove(3);
		System.out.println("=============");
		System.out.println(ar.get(3));//500
		System.out.println("=============");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("=============");
		//==============================================
		
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		numbers.add(500);
		numbers.add(600);
		numbers.add(700);
		
		for(Integer e:numbers) {
			System.out.println(e);
		}
		System.out.println("=============");
		for(int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("=============");
		ArrayList<Double> d= new ArrayList<Double>();
		d.add(45.90);
		d.add(89.90);
		d.add(56.90);
		
		for(Double e: d) {
			System.out.println(e);
		}
		
		ArrayList<String> s= new ArrayList<String>();
		s.add("Chrome");
		s.add("Firefox");
		s.add("Safari");
		
		for(String e: s) {
			System.out.println(e);
		}
		
		
		ArrayList<Object> empData= new ArrayList<Object>();
		empData.add("Tom");
		empData.add(2006);
		empData.add(12345.89);
		empData.add('M');
		empData.add(true);
		
		
		for(Object e:empData) {
			System.out.println(e);
			if(e.equals("Tom")) {
				System.out.println("He is a manager");
				//break;
			}
		}

	}

}
