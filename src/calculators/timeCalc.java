package calculators;

import java.util.Scanner;

public class timeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Start time? Please enter in 24h format:");
		
		int start = input.nextInt();
		
		System.out.println("Time intervals in minutes:");
		
		int interval = input.nextInt();
		
		System.out.println("End time? Please enter in 24h format:");
		
		int end = input.nextInt();
		
		for(int i = start; i < end; i+=25) {
			int min = i % 100;
//			System.out.println(min);
			if(min >= 60) {
				i=(i-min)+100+(min-60);
				System.out.println(i);
			}
			else {
				System.out.println(i);
			}
		}
		
		System.out.println(1234 % 100);

	}

}
