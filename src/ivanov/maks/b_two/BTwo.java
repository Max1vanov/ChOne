package ivanov.maks.b_two;

import ivanov.maks.b_one.CrSeq;
import java.util.Arrays;

public class BTwo {
    public static void main(String[] args) {
        CrSeq cS = new CrSeq();
        MaxM findMax = new MaxM();
        MinM findMin = new MinM();

        int[] ex = cS.crSec(10);
        System.out.println(Arrays.toString(ex));
        findMax.max(ex);        
        findMin.min(ex);

        System.out.println();

        String[] exSt = cS.crSeqSt(10);
        System.out.println(Arrays.toString(exSt));
        findMax.max(exSt);
        findMin.min(exSt);
    }
}
