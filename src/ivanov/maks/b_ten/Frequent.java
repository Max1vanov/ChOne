package ivanov.maks.b_ten;

import java.util.Arrays;

public class Frequent {
    public int[] findFrequent(int[] seq) {
        System.out.println(Arrays.toString(seq));
        int[] countSec = new int[seq.length];
        for (int i = 0; i < seq.length; i++) {
            int count = 0;
            for (int aSeq : seq) {
                if (seq[i] == aSeq) {
                    count++;
                }
            }
            countSec[i] = count;
        }

        for (int k = 0; k < countSec.length; k++) {
            for (int j = countSec.length-1; j > k; j--) {

                if (countSec[j] > countSec[j-1]) {

                    int tempFirst = countSec[j];
                    countSec[j] = countSec[j - 1];
                    countSec[j - 1] = tempFirst;

                    int temp = seq[j];
                    seq[j] = seq[j - 1];
                    seq[j - 1] = temp;
                }
            }
        }
        return seq;
    }
}
