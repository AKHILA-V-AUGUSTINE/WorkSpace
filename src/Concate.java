import java.util.Scanner;

public class Concate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first word:");
        String firstword=scanner.nextLine();
        System.out.print("Enter the second word:");
        String secondword= scanner.nextLine();
        String concatenatedw=firstword+" "+secondword;
        System.out.println("Concatenated word is:" + concatenatedw);
    }
}
