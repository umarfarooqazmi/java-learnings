import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        double num1;
        double num2;
        char operator;
        double result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter #1 = ");
        num1 = scanner.nextDouble();
        System.out.print("Enter #2 = ");
        num2 = scanner.nextDouble();
        System.out.print("Enter operator = ");
        operator = scanner.next().charAt(0);

        if(operator == '+'){
            result = num1 + num2;
        }
        else if(operator == '-'){
            result = num1 - num2;

        }
        else if (operator == '*'){
            result = num1 * num2;

        }
        else if(operator == '/'){
            result = num1 / num2;

        }
        else {
            System.out.println("Invalid Operator");
        }

        System.out.println("Result is " + result);

    }

}
