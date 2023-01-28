package one;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//relational operators 
		//<,>,<=,>=,!=<,==
		//! negate
		System.out.println(4>3);//boolean value (true or false)
		System.out.println(5<9);
		System.out.println(5<=9);
		System.out.println(5>=9);
		System.out.println(5!=9);
		System.out.println(5==9);
		
		//logical operators 
		//&& (AND) (and Gate)
		//true && true =====>true
		//true && false======>false
		//false && true======>false
		//false && false ======>false
		System.out.println(2==2 && 5==5);
		System.out.println(2==2 && 5!=8);
		System.out.println(2!=2 && 5!=8);
		System.out.println(2==6 && 5==8);
		
		//OR //
		// true // true ====>true
		// true // false ===>true 
		// false// true =====>true
		// false// false=====>false 
		System.out.println(2==2 && 5!=8);
		System.out.println(2==2 && 5>8);
		System.out.println(2<2 && 5!=8);
		System.out.println(12<=2 && 5!=8);
		System.out.println(!(2==4));
	}


}
