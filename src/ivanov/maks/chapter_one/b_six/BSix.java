package ivanov.maks.chapter_one.b_six;

import ivanov.maks.chapter_one.b_one.CrSeq;

import java.util.Arrays;

public class BSix {
    public static void main(String[] args) {
        CrSeq cS = new CrSeq();
        int[] ex = cS.crSec(10, 1000);
        System.out.println(Arrays.toString(ex));
        ThreeDigit threeDigit = new ThreeDigit();
        threeDigit.findFigure(ex);
    }
}
