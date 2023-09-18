package c6_swicthcaseandoops;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day: ");
		day = sc.nextLine();
		
		switch(day)
		{
			case "Monday", "Tuesday" -> 
				System.out.println("Monday, Tuesday");
				//break;
			case "Wednesday" -> 
				System.out.println("Wednesday");
				//break;
			case "Thursday" ->
				System.out.println("Thursday");
				//break;
			case "Friday" ->
				System.out.println("Friday");
				//break;
			case "Saturday" ->
				System.out.println("Saturday");
				//break;
			case "Sunday" ->
				System.out.println("Sunday");
				//break;
			default ->
				System.out.println("Default");
				//break;
		}


	}

}
