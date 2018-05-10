package ivanov.maks.b_one;

public class BOne {
    public static void main(String[] args) {
        CrSeq cSeq = new CrSeq();
        int[]ex = cSeq.crSec(10);
        Even ev = new Even();
        ev.even(ex);
        Odd oddS = new Odd();
        oddS.findOdd(ex);
    }
}
