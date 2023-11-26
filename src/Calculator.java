public class Calculator {
    public static void main(String[] args) {
        double number1 = 7;
        double number2 = 8;
        char operator = '+';

        if (operator == '+') {
            System.out.println("Tổng: " + (number1 + number2));
        } else if (operator == '-') {
            System.out.println("Hiệu: " + (number1 - number2));
        } else if (operator == '*') {
            System.out.println("Tích: " + (number1 * number2));
        } else if (operator == '/') {
            System.out.println("Thương: " + (number1 / number2));
        }
    }
}
