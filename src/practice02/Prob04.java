package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		
		char[] c1 = str.toCharArray();
		int left  = 0;             
	    int right = c1.length - 1;  

	    while (left < right) {
	      char temp = c1[left];
	      c1[left]  = c1[right];    
	      c1[right] = temp;

	      left++; right--;        
	    }
		
		return c1;
	}

	public static void printCharArray(char[] array){
		System.out.println(array);
	}
}
