import java.util.Scanner;

public class Sum {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println("The sum is "+ (a+b));
    }
}