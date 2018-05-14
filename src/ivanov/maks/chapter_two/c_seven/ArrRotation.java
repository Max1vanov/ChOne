package ivanov.maks.chapter_two.c_seven;

import ivanov.maks.chapter_two.c_two.TwoDArray;

/**
 * Rotation the array
 */

public class ArrRotation {
    /**
     * Rotation the array
     * @param degree 90, 180, 270
     * @param seq array which need rotation
     */
    void turn(int degree, int[][] seq) {
        TwoDArray twoDArray = new TwoDArray();
        if (seq != null) {
            int length = seq.length;
            int[][] newArray = new int[length][length];
            if (degree == 90) {
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length; j++) {
                        newArray[i][j] = seq[j][length-1-i];
                    }
                }
                System.out.println("90 degrees");
                twoDArray.printArr(newArray);
            } else if (degree == 180) {
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length; j++) {
                        newArray[i][j] = seq[length-1-i][length-1-j];
                    }
                }
                System.out.println("180 degrees");
                twoDArray.printArr(newArray);
            } else if (degree == 270) {
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length; j++) {
                        newArray[j][length-1-i] = seq[i][j];
                    }
                }
                System.out.println("270 degrees");
                twoDArray.printArr(newArray);
            } else {
                System.err.println("Not the right number of degree!");
            }
        }
    }
}
