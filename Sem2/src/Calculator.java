import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Calculator {
    public static void main(String[] args) throws IOException {
        System.out.println("Чтобы выйти из калькулятора - введите команду Stop");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String op = "";
        String text = "";

        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        fh = new FileHandler("logCalculator.txt");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        logger.setUseParentHandlers(false);

        while (true) {
            if (op.equals("Stop")) {
                text = "Остановили программу";
                logger.info(text);
                break;
            }
            System.out.print("Введите число a: ");
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                text = String.format("Ввели число %d \n", a);
                logger.info(text);
            } else {
                System.out.println("Вы ввели не число");
            }

            System.out.print("Введите число b: ");
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                text = String.format("Ввели число %d \n", b);
                logger.info(text);
            } else {
                System.out.println("Вы ввели не число");
                text = "Ввели неверное занчение";
                logger.info(text);
            }


            System.out.print("Введите операцию + - * / : ");
            sc.nextLine();
            op = sc.nextLine();

            if (op.equals("+")) {
                System.out.println(a + b);
                text = "Произвели вычисление a + b";
                logger.info(text);
            }
            if (op.equals("-")) {
                System.out.println(a - b);
                text = "Произвели вычисление a - b";
                logger.info(text);
            }
            if (op.equals("*")) {
                System.out.println(a * b);
                text = "Произвели вычисление a * b";
                logger.info(text);
            }
            if (op.equals("/")) {
                System.out.println(a / b);
                text = "Произвели вычисление a / b";
                logger.info(text);
            }
        }
    }
}


