package ivanov.maks.chapter_two.c_two;

import java.util.Arrays;

/**
 * shift 2d array
 * @author Max Ivanov
 * @version 1.0
 */
public class Shift {
    /**
     * shift 2d array
     * @param left_right positive - shift on the lift, negative - shift on the right
     * @param top_bottom positive - shift at the up, negative - shift at the down
     * @param seq array which need shift
     */
    void shifrArray(int left_right, int top_bottom, int[][] seq) {
        if (seq != null) {

            //System.out.println(Arrays.deepToString(seq));
            int length = seq.length;
            int[][] newArray = new int[length][length];
            int[][] newArrayTwo = new int[length][length];

            if (left_right > length) {
                left_right = left_right - (left_right / length)*length ;
            }
            if (left_right > 0) {
                for (int i = 0; i < newArray.length; i++) {
                        System.arraycopy(seq[i], left_right, newArray[i],0,length-left_right);
                        System.arraycopy(seq[i], 0, newArray[i],length-left_right, left_right);
                }
            } else if (left_right < 0) {
                left_right = left_right * (-1);
                //System.out.println(left_right);
                for (int j = 0; j < newArray.length; j++) {
                    System.arraycopy(seq[j], length-left_right, newArray[j],0, left_right);
                    System.arraycopy(seq[j], 0, newArray[j],left_right,length-left_right);
                }
            } else {
                newArray = seq.clone();
            }

            if (top_bottom > length) {
                top_bottom = top_bottom / length;
            }
            if (top_bottom > 0) {
                for (int i = 0; i < newArray.length; i++) {
                    if (i + top_bottom < newArray.length) {
                        newArrayTwo[i] = newArray[i + top_bottom];
                    } else {
                        newArrayTwo[i] = newArray[i + top_bottom - newArray.length];
                    }
                }
            } else if (top_bottom < 0) {
                top_bottom = top_bottom * (-1);
                //System.out.println(top_bottom);
                for (int i = 0; i < newArray.length; i++) {
                    if (i + top_bottom < newArray.length) {
                        newArrayTwo[i + top_bottom] = newArray[i];
                    } else {
                        newArrayTwo[i + top_bottom - newArray.length] = newArray[i];
                    }
                }
            } else{
                newArrayTwo = newArray.clone();
            }
            System.out.println(Arrays.deepToString(newArrayTwo));
        }

    }
}
