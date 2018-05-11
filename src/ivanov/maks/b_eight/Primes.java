package ivanov.maks.b_eight;

import java.util.Scanner;

public class Primes {
    private Scanner scanner = new Scanner(System.in);
    //Empty string
    private String primeNumbers = "";

    void findPrimes() {
        System.out.print("Enter the volume: ");
        int num = scanner.nextInt();
        for (int j = 1; j <= num; j++) {
            int count = 0;
            for (int k = j; k >=1 ; k--) {
                if (j % k == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeNumbers = primeNumbers + j + " ";
            }
        }
        System.out.print("This volume has these prime numbers: ");
        System.out.println(primeNumbers);
    }
}
