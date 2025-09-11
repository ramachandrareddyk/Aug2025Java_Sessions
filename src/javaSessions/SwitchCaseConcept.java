package javaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = " Chrome ";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch crome browser");
			break;

		case "firefox":
			System.out.println("launch firefox browser");
			break;

		case "ie":
			System.out.println("launch ie browser");
			break;

		case "edge":
			System.out.println("launch edge browser");
			break;

		case "safari":
			System.out.println("launch safari browser");
			break;

		default:
			System.out.println("Please pass the correct browser name " + browser);
			break;
		case "opera":
			System.out.println("launch safari browser");
			break;
		}

		int x = 100;
		switch (x) {
		case 1:

			break;
		case 2:

			break;

		case 3:

			break;

		default:
			break;
		}
		
		//switch case is allwed data types:
			//1. byte
			//2. short
			//3. int 
			//4. char
			//5. String
		//switch case not allwed data types:
			//long
			//double
			//float
		
		char ch='c';
		
		switch (ch) {
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			break;
			
		default:
			System.out.println(ch+" is not a vowel");
			break;
		}

	}
	
	//1. Cross browser logic
	//2. Cross OS logic
	//3. Cross user logic
	//4. cross env logic

}
