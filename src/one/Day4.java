package one;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// conditional statement

		int marks = 33;
		if (marks <= 10) {
			System.out.println("Grade E");

		}
		if (10 < marks && marks <= 20) {
			System.out.println("D+");
		}
		if (20 < marks && marks <= 30) {
			System.out.println("D");
		}
		if (30 < marks && marks <= 40) {
			System.out.println("B+");
		}
		if (40 < marks && marks <= 50) {
			System.out.println("B");

		}
		int a = 0;
		if (a <= 10) {
			System.out.println("very week");
		} else if (a > 10 && a <= 20) {
			System.out.println("week");

		} else if (a > 20) {
			System.out.println("good");
		}
		int b = 0;
		if (b <= 50) {
			System.out.println("satisfaction");
		} else {
			System.out.println();
		}
	}

}
