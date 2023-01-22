import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Введите число a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Введите число b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Введите операцию + - * / : ");
        String op = new Scanner(System.in).nextLine();

        if (op.equals("+")) {
            System.out.println(a + b);
        }
        if (op.equals("-")) {
            System.out.println(a - b);
        }
        if (op.equals("*")) {
            System.out.println(a * b);
        }
        if (op.equals("/")) {
            System.out.println(a / b);
        }
    }
}