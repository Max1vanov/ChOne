package ivanov.maks.chapter_two.c_seven;

import ivanov.maks.chapter_two.c_two.TwoDArray;


/**
 * Execute of the ArrRotation class
 * @see ArrRotation Arrrotation
 * @author Max Ivanov
 * @version 1.0
 */
public class CSeven {
    public static void main(String[] args) {
        TwoDArray twoDArray = new TwoDArray();
        int[][] ex = twoDArray.create();
        twoDArray.printArr(ex);
        ArrRotation arrRotation = new ArrRotation();
        arrRotation.turn(90, ex);
        arrRotation.turn(100, ex);
        arrRotation.turn(270, ex);
    }
}
