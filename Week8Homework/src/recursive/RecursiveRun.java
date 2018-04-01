package recursive;

//import java.io.Reader;
import java.util.Scanner;

public class RecursiveRun {

	public static void main(String[] args) {
		 
		System.out.println("Welcome to Fibonacci!");
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter a number: "); 
		int input = new Scanner(System.in).nextInt();
		userinput.close();
		
		for (int i = 1; i <= input; i++) 

		System.out.println(i + ":" + fibber(i));
			
	} 
	
	public static int fibber(int input) {
		
		if (input <= 1) return input; 
		else return fibber(input-1) + fibber(input-2); 
			
	}
}
