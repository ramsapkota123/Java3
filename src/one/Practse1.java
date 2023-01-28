package one;

public class Practse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = add(5, 7);
		System.out.println(y);
		subtract(5,8);

	}
	//parameter with return type 

	static int add(int x, int y) {
		return x + y;

	}
	//function with parameter but no return type
	static void subtract(int a ,int b) {
		System.out.println(a+b);
		
	}

}
