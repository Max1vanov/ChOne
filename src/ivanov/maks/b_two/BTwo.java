package ivanov.maks.b_two;

import ivanov.maks.b_one.CrSeq;
import java.util.Arrays;

public class BTwo {
    public static void main(String[] args) {
        CrSeq cS = new CrSeq();
        int[] ex = cS.crSec(10);
        System.out.println(Arrays.toString(ex));
        MaxM findMax = new MaxM();
        findMax.max(ex);
        MinM findMin = new MinM();
        findMin.min(ex);
    }
}
