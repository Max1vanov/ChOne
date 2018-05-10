package ivanov.maks.b_one;

public class CrSeq {
    int[] crSec(int n) {
        int[] seq = new int[n];
        for (int i = 0; i < seq.length ; i++) {
            seq[i] = (int) (Math.random() * 1000);
        }
        return seq;
    }
}
