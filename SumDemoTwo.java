import java.util.Scanner;
class SumDemoTwo {
	public static int sum(int sFirst,int sSecond) {   //parameter...called method
		int result;
		result=sFirst+sSecond;
		return result;
	}

	public static void main(String[] args) {     //argument...calling method
		int first;
		int second;
		int sumResult;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		first=sc.nextInt();
		second=sc.nextInt();
		sumResult=sum(first,second);
		System.out.println("Sum  = "+sumResult);
	}
}