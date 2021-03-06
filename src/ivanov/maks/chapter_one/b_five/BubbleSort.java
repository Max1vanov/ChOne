package ivanov.maks.chapter_one.b_five;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] seq) {
        for (int i = 0; i < seq.length; i++) {
            for (int j = seq.length-1; j > i; j--) {
                if (seq[j] > seq[j-1]) {
                    int temp = seq[j];
                    seq[j] = seq[j - 1];
                    seq[j - 1] = temp;
                }
            }
            System.out.println(Arrays.toString(seq));
        }
    }
}
