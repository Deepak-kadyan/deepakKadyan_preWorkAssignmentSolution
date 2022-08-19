
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	// function to check valid Input 
	public int checkCorrectInput(String msg) {
		boolean correctInput = false;
		int number =0;
		do
		{
			System.out.println(msg);
			
			if(sc.hasNextInt())
			{
				correctInput = true;
				number = sc.nextInt();
				
			}else
			{
				correctInput = false;
				System.out.println("you are expected to enter an integer value. ");
				sc.nextLine();
				System.out.println();
			}
		}while(!correctInput);
		return number;
	}
	
	// function to check Palindrome
	
	public void checkPalindrome() {
		
		String msg = "Enter the number to check whether it is a palindrome or not. ";

			int number = checkCorrectInput(msg);
		
			int reverseNumber = 0;
			int remainingNumber = number;
		
			while(remainingNumber >= 10) {
			
				reverseNumber = (reverseNumber * 10) + (remainingNumber % 10) ;
				remainingNumber = remainingNumber / 10 ;
			}
		
			reverseNumber = (reverseNumber * 10)+ remainingNumber ;
		
			if(number == reverseNumber)
			{
				System.out.println(number+" is a Palindrome nubmer");
			}
			else
			{	
				System.out.println(number+" is not a Palindrome nubmer");
			}
	}
	
	//function to printPattern
	
	public void printPattern() {
		
		String msg = "Enter the number for pattern. ";
		
			int number = checkCorrectInput(msg);
		
			for (int row=1 ; row <= number ; row++) {
			
				for(int col=1 ; col <= number- (row-1) ; col++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}
	
	//function to check no is prime or not
	
	public void checkPrimeNumber() {
		String msg = "Enter the number to check whether it is a Prime Number or not. ";
		
			int number = checkCorrectInput(msg);
			int factors = 0;
		
			for(int count=1; count <= number; count++ ) {
			
				if(number % count == 0) {
					factors ++;
				}
			
				if(factors > 2) {
					break;
				}
			
			}
		
			if(factors == 2) {
				System.out.println(number+" is a prime Number.");
			}else {
				System.out.println(number+" is not a prime Number.");
			}
	}
	
	// function to print FibonacciSeries
	public void printFibonacciSeries() {
		
		//initialize the first and second value as 0,1 respectively.
		int first=0, second=1;
		int sum=0;
			
		String msg = "Enter the number to print Fibvonacci Series. ";
		
			int number = checkCorrectInput(msg);
		
			System.out.print("The Fibonacci series is : ");
		
			if(number == 1) {
			
				System.out.print(first);
				System.out.println();
			
			
			}else {
			
				System.out.print(first);
				System.out.print(", "+second);
			
				for(int i=1 ; i<= number-2 ; i++) {
					sum = first + second;
					System.out.print(", "+sum);
					first = second;
					second = sum;
				}
				System.out.println();
			}
	}
	
	//main method which contains switch and do while loop
	public static void main(String [] args) {
		Main obj = new Main();
		int choice;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice from below list.\n"+"1. Find palindrome of number.\n"
			+"2. Print Pattern for a given no.\n"+"3. Check whether the no is a prime number.\n"
			+"4. Print Fibonacci series.\n"+"--> Enter 0 to Exit.\n");
			
			System.out.println();
			if(sc.hasNextInt())
			{	
				choice = sc.nextInt();
			
				switch(choice) {
			
				case 0:
					choice =0;
					break;
				
				case 1: {
					obj.checkPalindrome();
					}
					break;
				
				case 2: {
					obj.printPattern();
					}
					break;
				
				case 3: {
					obj.checkPrimeNumber();
					}
					break;
				
				case 4:{
					obj.printFibonacciSeries();
					}
					break;
				
				default :
					System.out.println("Invalid choice. Enter a valid no.\n");
				}
			}
			else
			{
				choice = 5;
				System.out.println("you are expected to enter an integer value");
				sc.nextLine();
				System.out.println();
			}
			
			}while(choice != 0);
		
		System.out.println("Exited Successfully !!!");
		sc.close();
	}
}
