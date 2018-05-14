package ivanov.maks.chapter_two.c_two;

import java.util.Arrays;

/**
 * Execute of the Shift class
 */

public class CTwo {
    public static void main(String[] args) {
        TwoDArray twoDArray = new TwoDArray();
        Shift shift = new Shift();
        int[][] ex = twoDArray.create();
        System.out.println(Arrays.deepToString(ex));
        shift.shifrArray(1,-1,ex);
        shift.shifrArray(-1,1,ex);
    }
}
