package ivanov.maks.chapter_one.b_five;

import ivanov.maks.chapter_one.b_one.CrSeq;
import ivanov.maks.chapter_one.b_two.MaxM;
import ivanov.maks.chapter_one.b_two.MinM;

import java.util.Arrays;

public class BFive {
    public static void main(String[] args) {
        CrSeq cS = new CrSeq();
        int[] ex = cS.crSec(10, 1000);
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
