import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Калькулятор готов. Введите выражение или \"exit\", чтобы завершить работу:");
        Scanner sc = new Scanner(System.in);
        int a, b;
        String op;

        while (true) {
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 3) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)\n.");
                continue;
            }

            try {
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[2]);
                op = parts[1];

                System.out.println("Result = " + operation(a, b, op));

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + ". Пожалуйста, введите корректное выражение.");
            }
        }
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
                if (b == 0) {
                    throw new IllegalArgumentException("Ошибка/ делениe на ноль.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Недопустимый оператор: " + op);
        }
    }
}