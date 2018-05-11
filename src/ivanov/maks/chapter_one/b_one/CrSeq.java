package ivanov.maks.chapter_one.b_one;

public class CrSeq {
    public int[] crSec(int n, int m) {
        int[] seq = new int[n];
        for (int i = 0; i < seq.length ; i++) {
            seq[i] = (int) (Math.random() * m);
        }
        return seq;
    }

    public String[] crSeqSt(int n, int m) {
        String[] seq = new String[n];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = String.valueOf((int)(Math.random() * m));
        }
        return seq;
    }
}
