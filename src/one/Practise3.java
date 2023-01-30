package one;

public class Practise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//function with parameter
		//function with parameter and return type
		//function with no parameter and no return type 
		arithmetic ();
		int a=callReturn(5,6);
		System.out.println(a);
		callReturn1(4,6);
		callReturn2();
		int l=10;
		int k=20;
		if(l>k) {
			System.out.println("l is grater");
		}else {
			System.out.println("k is greater");
		}
		System.out.println(5>8);
		callAndGate();	
		callOrGate();
		disPlaySwitchCase();
		
		
	}
	static void arithmetic() {
		System.out.println("Hello");
		
	}
	static int callReturn(int x,int y) {
		return x-y;
		
	}
	static void callReturn1(int a,int b) {
		System.out.println(a+b);
	}
	static void callReturn2() {
		System.out.println(5+6);
	}
	//truth table
	//true and true==>true
	//true and false==>false
	//false and true==>false
	//false and false==>false
	static void callAndGate() {
		System.out.println(5<6&&7>4);
		System.out.println(5<6&&7>8);
		System.out.println(51<6&&7>4);
		System.out.println(15<6&&7>41);
		
	}
	//truth table
		//true // true==>true
		//true // false==>true
		//false // true==>true
		//false //false==>false
	static void callOrGate() {
		System.out.println(5<6 ||7>4);
		System.out.println(5<6||7>8);
		System.out.println(51<7||7>4);
		System.out.println(15<3||7>41);
		
	}
	static void disPlaySwitchCase() {
		int k=1;
		switch(k) {
		case 1:
			System.out.println("sunday");
		case 2:
			System.out.println("monday");
		case 3:
			System.out.println("tusday");
		case 4:
			System.out.println("wednesday");
		case 5:
			System.out.println("thursday");
		case 6:
			System.out.println("friday");
		case 7:
			System.out.println("saturday");
			default:
				System.out.println("no more day");
				//Hi i am Ram
		}
		
	}
	
	
	}

