package ivanov.maks.chapter_one.b_ten;

import ivanov.maks.chapter_one.b_one.CrSeq;

import java.util.Arrays;

public class BTen {
    public static void main(String[] args) {
        CrSeq cSeq = new CrSeq();
        int[] ex = cSeq.crSec(10, 5);
        Frequent frequent = new Frequent();
        System.out.println(Arrays.toString(frequent.findFrequent(ex)));
    }
}
