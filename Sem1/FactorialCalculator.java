import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int n = new Scanner(System.in).nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
            System.out.println(sum);
        }
    }
}
