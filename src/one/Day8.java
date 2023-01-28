package one;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while loop
		int i=0;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		int j=5;
		while(j>=0) {
			System.out.println(j);//5,4,3,2,1,0
			j--;//4,3,2,1,0
			
		}
		int a=0;
		while(a<=5) {
			System.out.println("Hello");
			a++;
		}
		int b=0;
		while(b<=5) {
			System.out.println(b);
			if(b==3) {
				break;
			}
			b++;
		}
		int c=0;
		while(c<=5) {
			if(c==3) {
				break;
			}
			System.out.println(c);
			c++;
			
			
		}
		int h = 1;
		while (h <= 5) {
			if (h == 2) {
				h++;

				continue;
			}
			System.out.println(h);//
			h++;

		}
		
		
		
	}
}
