package javaSessions;

public class Multi_Dimentional_Array {

	public static void main(String[] args) {
		
		
		
		//1,2,3,4...
		//00,01
		//10,11
		
		int arr[][]=new int[2][3];
		System.out.println(arr.length);//
		
		arr[0][0]=3;
		arr[0][1]=5;
		arr[0][2]=7;
		arr[1][0]=2;
		arr[1][1]=4;
		arr[1][2]=6;
		
		//2 columns
		//3 rows
		//size of array: 2x3=6
		System.out.println(arr[0][1]);//5
		System.out.println(arr[1][2]);//6
	//	System.out.println(arr[1][3]);
		
		System.out.println("==============");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("==============");
		int a[][]= {{1,2},{2,3},{3,4}};
		System.out.println(a.length);
		System.out.println(a[0][0]);

	}

}
