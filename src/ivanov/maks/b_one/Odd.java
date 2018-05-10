package ivanov.maks.b_one;

import java.util.Arrays;

class Odd {
    void findOdd(int[] seq) {
        System.out.println(Arrays.toString(seq));
        System.out.println("Odd members of array:");
        for (int s :
                seq) {
            if (s % 2 != 0) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
    }
}
