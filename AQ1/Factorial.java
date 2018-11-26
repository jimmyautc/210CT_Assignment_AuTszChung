/*
	course:210ct
	Name:AuTszChung
	Program:Factorial.java
	Description:Program to calculate the Factorial
*/
import java.util.*;
public class Factorial {
    public static void main(String [] args){
		//declare variable
        int n;
		int m;
		int fac;
		//new scanner
		Scanner scanner = new Scanner(System.in);
		//get user input number for factorial
		while(true){       

			System.out.println("Please input a Number for factorial:");
			//use scanner to get integer
			n = scanner.nextInt();		
			//get number less than 231
			if(n>231){
				System.out.println("The number for factorial must less then 231");							
			}else if(n<0){
				System.out.println("The number for factorial must be non-negative integer");					
			}
			else{
				break;
			}		

		 }
		 //get user input number for factorial
		 while(true){       
			
			System.out.println("Please input a Number for divide:");
			//use scanner to get integer
			m = scanner.nextInt();	
			//get number less than 231				
			if(m>231){
				System.out.println("The number for divide must less then 231");							
			}else if(m<0){
				System.out.println("The number for divide must be non-negative integer");					
			}
			else{

				break;
			}		

		 }
		 //print factorial 
		fac=factorial(n);
        System.out.println("Factorial of " + n + " is " + fac);	
		//show that is m can divide by n
		if (fac%m == 0){
			System.out.println(m+" can be divide"+n+"!");	
		}
		else{
			System.out.println(m+" can not be divide"+n+"!");			
		}
    }
	//method of calculate factorial
	public static int factorial(int n){
        int fac=1;
           if (n == 1||n == 0) {
                fac = 1;
            } else if (n < 231) {
                fac = 1;
                for (int i = 1; i <= n; i++) {
                    fac = fac * i;
                }
            }
		return fac;

	}
}