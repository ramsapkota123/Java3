package one;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Define and variable and assign a valu
		int a =10;
		System.out.println(a);
		int x=30;
		int y=60;
		int t=x+y;
		System.out.println(t);
		//calling the function
		cal(12,6);
		//calling the second function calA();
		calA();
		int u=calB(6,7);
		System.out.println(u);
		int q=subtract(8,9);
		System.out.println(q);
		int z=multiplication(3,4);
		System.out.println(z);
		int f=divide(44,4);
		System.out.println(f);
		int h=modules(88,4);
		System.out.println(h);
		
		
		
		
		
	

	}
	//function with parameter
	public static void cal(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

	}
	//function without parameter
	public static void calA() {
		System.out.println(9+9);
	}
	//function with parameter and with return type 
	//Difference --->$100 given and showing $100
	static int calB(int r,int t) {
		return (r+t);
	}
	static int subtract(int v,int u) {
		return v-u;
	}
	static int multiplication(int g,int h) {
		return g*h;
	}
	static int divide(int l,int m) {
		return l*m;
	}
	static int modules(int g,int f) {
		return g%f;
	}

	

}
