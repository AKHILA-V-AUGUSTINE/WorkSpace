//function with argument without return value

import java.util.Scanner;
class SumDemoFour {
	public static void sum(int first,int second) {   //parameter...called method
		
		
		System.out.println("Sum  = "+(first+second));
	}

	public static void main(String[] args) {     //argument...calling method
		int first;
		int second;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		first=sc.nextInt();
		second=sc.nextInt();
		
		sum(first,second); //argument
	}
}