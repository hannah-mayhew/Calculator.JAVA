import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");

        System.out.println("Enter your first number");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();

        Calculation Calculation = chooseCalculation();

        System.out.println("Enter your second number");
        int second = scanner.nextInt();

        int result = Calculation.calculate(first, second);

        System.out.println("Your answer is: " + result);
    }

    public interface Calculation {
        int calculate(int first, int second);
    }

    private static Calculation chooseCalculation() {
        System.out.println("Choose an operation: +/*/-");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String add = "+";
        String subtract = "-";
        String multiply = "*";

        if (input.equals(add)) {
            return new Add();
        } else if (input.equals(multiply)) {
            return new Multiply();
        } else if (input.equals(subtract)) {
            return new Subtract ();
        }

        class Add implements Calculation {
            public int calculate(int first, int second) {
                return first + second;
            }
        }
        class Multiply implements Calculation {
            public int calculate(int first, int second) {
                return first * second;
            }
        }
        class Subtract implements Calculation {
            public int calculate(int first, int second) {
                return first - second;
            }
        }
    }
}
