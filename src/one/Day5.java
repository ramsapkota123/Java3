package one;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch out break
		int day =6;
		switch(day) {
		case 1:
			System.out.println("sunday");
		case 2:
			System.out.println("monday");
		case 3:
			System.out.println("tuesday");
		case 4:
			System.out.println("wednesday");
		case 5:
			System.out.println("thrusday");
		case 6:
			System.out.println("friday");
		case 7:
			System.out.println("saturday");
		default:
			System.out.println("no more day");
		}
		//with break statement
		int weekDays =1;
		switch(weekDays) {
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
			System.out.println("saturday");
			break;
		default:
			System.out.println("no more day");
		

	}
		String city="Haltom";
		switch(city) {
		case "euless":
			System.out.println("Texas");
			break;
		case "dallas": 
			System.out.println("Newwork");
			break;
		case "Haltom":
			System.out.println("Oklohoma");
			break;
			default:
				System.out.println("wrong city name");
		}
		String cityy="Halom";
		switch(cityy){
		case "Halom":
		case "Irving":
			System.out.println("Texas");
			break;
		case "euless":
		case"hurst":
			System.out.println("Newwork");
			break;
		default:
			System.out.println("no more");
			
			
			
		}
		
		
	
	
	
	
	}}
