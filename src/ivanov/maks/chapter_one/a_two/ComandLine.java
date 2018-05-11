package ivanov.maks.chapter_one.a_two;

import java.util.Arrays;

class ComandLine {
    void line(String[] lineSt) {
        for (int i = 0; i < lineSt.length/2; i++) {
            String temp;
            temp = lineSt[i];
            lineSt[i] = lineSt[lineSt.length - 1 - i];
            lineSt[lineSt.length - 1 - i] = temp;
            //System.out.println(Arrays.toString(lineSt));
            //System.out.println();
        }
    }

    void showLine(String[] lineSt) {
        System.out.println(Arrays.toString(lineSt));
    }
}
