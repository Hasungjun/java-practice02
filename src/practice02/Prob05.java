package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {


	public static void main(String[] args) {
		
		while(true) {
		Scanner scanner = new Scanner( System.in );
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		int start = 1;
		int end = 100;
		System.out.println(k);
		while(true)
		{
		int num = scanner.nextInt();  
		if(num<k)
		{
			start = num;
			System.out.println("더높게"+start+"-"+end);
		}
		else if(num>k)
		{
			end = num;
			System.out.println("더낮게"+start+"-"+end);
		}
		else if(num==k)
		{
			System.out.println("정답");
			System.out.println("종료하시겠습니까? y/n");
			String answer = scanner.next();
			if( answer.equals("y") ){
				end = 0;
				break;
			    //종료하도록 작성한다.	
			}	
		}
		
		}
		
		if(end==0)
			break;
		scanner.close();
	}
}
	}
