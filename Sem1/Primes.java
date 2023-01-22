//import java.util.Scanner;


public class Primes {
public static void main(String[] args) {
    // System.out.print("Введите число n: ");
    // int n = new Scanner(System.in).nextInt();
    for (int index = 3; index <= 1000; index++) {
        int count = 0;
        if (index == 2 || index == 3 || index == 5 || index == 7){
            System.out.print(index + " ");
        }
        if (index % 2 == 0) {
            continue;
        }
        if (index % 3 == 0) {
            continue;
        }
        if (index % 5 == 0) {
            continue;
        }
        if (index % 7 == 0) {
            continue;
        }
      
        if (count / index == 0) {
            count = index;
            System.out.print(count + " ");
            }
        }
    }
}
    
