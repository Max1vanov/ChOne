package ivanov.maks.chapter_two.a_six;

import ivanov.maks.chapter_one.b_one.CrSeq;
import java.util.Arrays;

/**
 * This Class execute class FinderNumber
 * <p>
 *     To create an array, use the class CrSeq
 * @see CrSeq
 * </p>
 * @author Max Ivanov
 */

public class ATwo {
    public static void main(String[] args) {
        CrSeq cSeq = new CrSeq();
        String[] ex = cSeq.crSeqSt(30, 100);
        System.out.println(Arrays.toString(ex));
        FinderNumber finder = new FinderNumber();
        finder.FNum(ex);
        String[] ex2 = {"132", "321", "123"};
        finder.FNum(ex2);
    }
}
