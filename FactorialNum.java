import java.util.Scanner;
class FactorialNum {
	public static void factorial(int num) {  
		
		int fact=1;
		for(int i=1;i<=num;i++) {
	 	 	 fact=fact*i;
	 	}
		System.out.println("Factorial of "+num+"is"+fact);
	}

	public static void main(String[] args) {     
		int num;
		int fact;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		factorial(num);
		
	}
}