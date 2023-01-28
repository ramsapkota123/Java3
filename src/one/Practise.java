package one;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addPlay(50, 20);
		showRelational();
		
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		int day = 5;
		switch (day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thrusday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("satruday");
			break;
		default:
			System.out.println("no more day");

		}
		String city = "Haltom";
		switch (city) {
		case "Haltom":
		case "Euless":
			System.out.println("TX");
			break;
		case "irving":
			System.out.println("oklohoma");

		}
		int y = 0;
		int x = 0;
		while (y <= 5) {
			x = y + x;// 2,
			y = y + 1;// 1,2
		}
		System.out.println(x);// 2,

	}
	/*
	 * no parameter and no return type one example let see what is going on basic
	 * operators arithmetic operators relational operators bitwise operators logical
	 * operators assignment operators misc operators
	 * 
	 * arithmetic operators arithmetic operators arithmetic operators arithmetic
	 * operators arithmetic operators relational operators relational operators
	 * relational operation relational operators logical operators logical operators
	 * boolean type boolean tpe logical type logical type logical type logical type
	 * logical type logical type a && b a // b truth table true && true=true true &&
	 * true=false False && true= false false && false=false and gate or gate true //
	 * true =true true // false =true false // true=true false // false=false
	 * arithmetic operators relational operators logical operatos assignment
	 * operator arithmetic operators -,+,*,/,% relational operators <,>,<=,>=,==,!=
	 * logical operators and gate and or gate and gate(&&) true && true= true true
	 * && false =false false && true=false false && false=false or gate true // true
	 * =true true //false=true false//true =true false//false=false
	 */

	// arithmetic operators
	static void addPlay(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

	}

	static void showRelational() {
		int x = 0;
		if (x == 6) {
			System.out.println("flse");
		} else {
			System.out.println("true");
		}
		int g = 90;
		if (g >= 0 && g <= 10) {
			System.out.println("D grade");

		}
		if(g>10&&g<=20) {
			System.out.println("c grade");
		}
		if(g>20&&g<=30) {
			System.out.println("B grade");
		}
		if(g>30&&g<=40) {
			System.out.println("A grade");
		}
	}

}
