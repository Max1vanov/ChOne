package ivanov.maks.b_one;

public class CrSeq {
    public int[] crSec(int n) {
        int[] seq = new int[n];
        for (int i = 0; i < seq.length ; i++) {
            seq[i] = (int) (Math.random() * 1000);
        }
        return seq;
    }

    public String[] crSeqSt(int n) {
        String[] seq = new String[n];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = String.valueOf((int)(Math.random() * 1000));
        }
        return seq;
    }
}
