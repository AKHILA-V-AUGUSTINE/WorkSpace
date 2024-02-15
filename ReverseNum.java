import java.util.Scanner;
class ReverseNum {

	public static void numReverse(int num) {
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("The reverse number is "+rev);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
	 	System.out.println("Enter the number");
		num=sc.nextInt();
		numReverse(num);
		
	}
}