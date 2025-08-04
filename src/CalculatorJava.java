import java.util.Scanner;

public class CalculatorJava {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed");
            return Double.NaN;
        }

        return a / b;
    }

    public static void main(String[] args) {

        // Scanner sc;
        Scanner sc;
        while (true) {

            sc = new Scanner(System.in);

            System.out.println("Enter the first number: ");
            double a = sc.nextDouble();

            System.out.println("Enter operator (+,-,*,/): ");
            char operator = sc.next().charAt(0);

            System.out.println("Enter the second number: ");
            double b = sc.nextDouble();

            double result = 0;

            switch (operator) {
                case '+':
                    result = add(a, b);
                    break;
                case '-':
                    result = subtract(a, b);
                    break;
                case '*':
                    result = multiply(a, b);
                    break;
                case '/':
                    result = divide(a, b);
                    break;

                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n")) {
                System.out.println("Exiting calculator. Thank you!");
                break;
            }

        }

        sc.close();
    }


}
