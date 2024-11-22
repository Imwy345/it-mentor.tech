import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(scanner.nextLine()));
    }

    public static String calc(String input) throws Exception {

        int operand1, operand2;

        String string[] = input.split(" ");

        if (string.length != 3 || !string[1].matches("[+\\-*/]")) {
            throw new Exception("Строка не является корректной математической операцией или формат не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        try {
            operand1 = Integer.parseInt(string[0]);
            operand2 = Integer.parseInt(string[2]);
        } catch (Exception e) {
            throw new Exception("Операнды должны быть целыми числами.");
        }

        if (operand1 < 1 || operand1 > 10 || operand2 < 1 || operand2 > 10) {
            throw new Exception("Значаения операндов выходят за значения от 1 до 10 включительно");
        }

        switch (string[1]) {
            case "+":
                return String.valueOf(operand1 + operand2);

            case "-":
                return String.valueOf(operand1 - operand2);

            case "*":
                return String.valueOf(operand1 * operand2);

            case "/":

                return String.valueOf(operand1 / operand2);
        }
        return null;
    }
}
