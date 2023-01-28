package one;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loop
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			
			
		}
		for(int x=5;x>=1;x--) {
			System.out.println(x);
		}
		//break statement with for loop
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			
			if(i==3) {
				break;
			}
			
		}
		for(int i=5;i>=1;i--) {
			if(i==2) {
				break;
			}
			System.out.println(i);
		}
		for(int i=5;i>=0;i--) {
			System.out.println(i);
			if(i==4) {
				break;
			}
			
			}
		for(int i=1;i<=5;i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		}

	}


