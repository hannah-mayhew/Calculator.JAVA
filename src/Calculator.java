import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        int first = scanner.nextInt();

        System.out.println("Choose an operation: +/*/-");
            String input = scanner.next();
            String add = "+";
            String subtract = "-";
            String multiply = "*";
            int answer = 0;

        System.out.println("Enter your second number");
        int second = scanner.nextInt();

            if (input.equals(add)) {
                answer = first + second;
            }
            else if (input.equals(multiply)) {
                answer = first * second;
            }
            else if (input.equals(subtract)) {
                answer = first - second;
            }

        System.out.println("The answer is: " + answer);
    }
}