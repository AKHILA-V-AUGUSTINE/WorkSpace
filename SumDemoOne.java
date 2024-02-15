import java.util.Scanner;
class SumDemoOne {
	public static int sum(int first,int second) {
		int result;
		result=first+second;
		return result;
	}

	public static void main(String[] args) {
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