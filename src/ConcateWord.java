import java.util.Scanner;

public class ConcateWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Firstword:");
        String first=scanner.nextLine();
        System.out.print("Enter the Secondword:");
        String second=scanner.nextLine();
        String result=first.concat(second);
        System.out.print(result);

    }
}
