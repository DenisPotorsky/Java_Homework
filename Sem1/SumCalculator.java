import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        System.out.print("Введине число N: ");
        int n = new Scanner(System.in).nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
            if (i < n) {
                System.out.print(res + ", ");
            }
            if (i == n) {
                System.out.println(res);
            }
        }
    }
}
