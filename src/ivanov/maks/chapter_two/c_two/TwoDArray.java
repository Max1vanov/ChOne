package ivanov.maks.chapter_two.c_two;

import java.util.Scanner;

/**
 * Create 2d array with size [N][N]
 */
public class TwoDArray {
    /**
     * Create new 2d array with size [size][size]
     * @return new 2d array with values from size to size
     */
    public int[][] create() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter size of the 2d array: ");
            int size = scanner.nextInt();
            if (size > 0) {

                int[][] ex = new int[size][size];
                for (int i = 0; i < ex.length; i++) {
                    for (int j = 0; j < ex[i].length; j++) {
                        ex[i][j] = (int) ((Math.random() * 2 * size) - size);
                    }
                }
                return ex;
            } else return null;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }

    /**
     * Print the array
     * @param seq array which need print
     */
    public void printArr(int[][] seq) {
        int length = seq.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(seq[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}
