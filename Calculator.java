import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = x.nextInt();

        System.out.print("Enter Operator: ");
        char op = x.next().charAt(0);

        System.out.print("Enter 2nd Number: ");
        int b = x.nextInt();

        if(op == '+'){
            System.out.println("Addition = " + (a + b));
        } else if (op == '-') {
            System.out.println("Subtraction = " + (a - b));
        } else if (op == '*') {
            System.out.println("Multiplication = " + (a * b));
        } else if (op == '/') {
            if(b != 0) {
                System.out.println("Division = " + ((double)a / b));
            } else {
                System.out.println("Cannot divide by zero!");
            }
        } else {
            System.out.println("Invalid operator");
        }
    }
}
