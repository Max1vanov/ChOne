package ivanov.maks.chapter_two.b_four;

import java.util.Scanner;

/**
 * Print the mane of the month by the number that was entered in the console
 * Check of entered data
 * @author Max Ivanov
 * @version 1.0
 */
public class Month {
    /**
     * Print the name month
     * @param month number month which you enter
     */
    void nameMonth(int month) {
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.err.println("Incorrect number");
        }
    }

    /**
     * Enter tbe month number
     * @return month number or 0 if enter the incorrect data
     */
    int yourEnter (){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the month number: ");
            return scanner.nextInt();
        } catch (Exception e) {
            return 0;
        }
    }
}
