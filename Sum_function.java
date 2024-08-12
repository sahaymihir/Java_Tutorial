import java.util.Scanner;

public class Sum_function {

    public static int Sum (int a,int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();

        System.out.println("Sum of " + a + " and " + b + " is "+ Sum(a,b));
        s.close();
    }
}