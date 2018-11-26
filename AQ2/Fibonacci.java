/*
	course:210ct
	Name:AuTszChung
	Program:Fibonacci.java
	Description:Program to display the Fibonacci series
*/
import java.util.*;
public class Fibonacci {
    public static void main(String[]args){
		//declare variable
		int fib;
		//new scanner		
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Please input a Number for Fibonacci:");
		//get user input number for Fibonacci
		fib = scanner.nextInt();
		series(fib);
    }
	
	//method to calculate the Fibonacci series
    public static void series(int count){
			//declare variable
		int temp1 = 1;
        int temp2 = 1;
        int current = 1;
        System.out.print("F1 to F"+count+": "+temp1+" , "+temp2);
        count=count-2;
		//while loop to calculate the Fibonacci number 
        while(count>0){
            current = temp1+temp2;
            temp1= temp2;
            temp2=current;
            System.out.print(" , "+current);
            count--;
        }
    }
}

