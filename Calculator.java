import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Calculator ready enter expression:\n enter 'exit' for leave");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String op = "";
        do {
            String input = sc.next();
            if (input.equals("exit")) {
                break;
            }
            String[] strings = input.split("\\W");
            String[] operator = input.split("\\w");
            try {
                a = Integer.parseInt(strings[0]);
                b = Integer.parseInt(strings[1]);

                if (a < 1 || a > 10 || b < 1 || b > 10) {
                    throw new IllegalArgumentException("Numbers must be between 1 and 10.");
                }

                op = operator[operator.length - 1];
                System.out.println("Result = " + operation(a, b, op));
            } catch (Exception e) {
                System.out.println("Error input: " + e.getMessage() + " try again");
            }
        } while (true);
    }

    private static int operation(int a, int b, String op) {
        switch (op) {
            case "*":
                return a * b;
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            default:
                return 0;

        }
    }
}
