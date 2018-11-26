/*
	course:210ct
	Name:AuTszChung
	Program:Fibonacci.java
	Description:Use the  Fibonacci
*/
import java.util.*;
public class Fibonacci {
    public static void main(String[]args){\
			//declare variable
			int fib;
			//new scanner
			Scanner scanner = new Scanner(System.in);	
			//get Fibonacci number
			System.out.println("Please input a Number for Fibonacci:");
			fib = scanner.nextInt();
				System.out.print("F1 to F"+fib+": ");			
			
			for(int i=1;i<=fib;i++){
				System.out.print("  "+series(i));
			}
		
    }
	//method to calculate the Fibonacci serial
    public static int series(int fib){

		if (fib==0 || fib==1){
			return fib;
		}
		else{
			return series(fib-1) + series(fib-2) ;
		}
    }
}

