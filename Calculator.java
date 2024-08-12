import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char x;
        do {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter first number: ");
            float a = sc.nextFloat();

            System.out.println("Enter Operation: ");
            char y = sc.next().charAt(0);
            
            System.out.println("Enter Second number: ");
            float b = sc.nextFloat();
            
            

            switch (y) {
                case '+':
                    System.out.println("Sum: "+(a+b));
                    break;

                case '-':
                    System.out.println("Difference: "+(a-b));
                    break;
                
                case '*':
                    System.out.println("Product: "+(a-b));
                    break;
                
                case '/':
                    System.out.println("Quotient: "+(a/b));
                    break;
            }
            
            System.out.println("Press y to continue and n to exit!!");
            x = sc.next().charAt(0);
            } while (x != 'n');
    }
}
