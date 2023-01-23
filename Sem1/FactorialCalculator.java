import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int n = scanner.nextInt();
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
                if (i < n) {
                    System.out.print(res + ", ");
                }
                if (i == n) {
                    System.out.println(res);
                }
            }
        }
    }
}
