import java.util.Scanner;
class SumDemoThree {
	public static int sum(int first,int second) {   //parameter...called method
		
		
		return (first+second);  //bracket is not mandatory
	}

	public static void main(String[] args) {     //argument...calling method
		int first;
		int second;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		first=sc.nextInt();
		second=sc.nextInt();
		
		System.out.println("Sum  = "+sum(first,second));
	}
}