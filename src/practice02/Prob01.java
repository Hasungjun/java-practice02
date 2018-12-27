package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int d = 0;
		Scanner scanner = new Scanner( System.in );
		System.out.println("금액:");
		int num = scanner.nextInt();  
		
		for(int i =0;i<10;i++)
		{
			d = num / MONEYS[i];
			System.out.println(MONEYS[i]+"원 :"+d+"개" );
			d = num % MONEYS[i];
			
			num = d;
			
		}
		 
		
		
		
	
		scanner.close();
	}

}
