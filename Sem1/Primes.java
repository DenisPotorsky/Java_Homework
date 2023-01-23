public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            int x = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0)
                    x++;
            }
            if (x < 2)
                System.out.print(i + " ");
        }
    }
}
