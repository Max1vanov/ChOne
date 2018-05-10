package ivanov.maks.b_five;

import ivanov.maks.b_one.CrSeq;
import ivanov.maks.b_two.MaxM;
import ivanov.maks.b_two.MinM;

import java.util.Arrays;

public class BFive {
    public static void main(String[] args) {
        CrSeq cS = new CrSeq();
        int[] ex = cS.crSec(10);
        BubbleSort bubble = new BubbleSort();
        System.out.println(Arrays.toString(ex));
        bubble.sort(ex);
        System.out.println(Arrays.toString(ex));

        MaxM findMax = new MaxM();
        MinM findMin = new MinM();
        findMax.max(ex);
        findMin.min(ex);
    }
}
