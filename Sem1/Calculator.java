import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Чтобы выйти из калькулятора - введите команду Stop");
        try (Scanner sc = new Scanner(System.in)) {
            int a = 0;
            int b = 0;
            String op = "";
            while (true) {
                System.out.println("Введите число a: ");

                if (sc.hasNextInt())
                    a = sc.nextInt();
                else
                    System.out.println("Вы ввели не число");

                System.out.print("Введите число b: ");
                if (sc.hasNextInt())
                    b = sc.nextInt();
                else
                    System.out.println("Вы ввели не число");

                System.out.print("Введите операцию + - * / : ");
                sc.nextLine();
                op = sc.nextLine();
                if (op.equals("Stop"))
                    break;
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
    }
}