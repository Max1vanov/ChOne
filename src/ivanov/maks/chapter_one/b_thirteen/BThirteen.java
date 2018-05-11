package ivanov.maks.chapter_one.b_thirteen;

import ivanov.maks.chapter_one.b_one.CrSeq;

import java.util.Arrays;

public class BThirteen {
    public static void main(String[] args) {
        CrSeq crSeq = new CrSeq();
        String[] ex = crSeq.crSeqSt(30, 10000);
        System.out.println(Arrays.toString(ex));
        Palindrome pal = new Palindrome();
        pal.palindrome(ex);
    }
}
