package ivanov.maks.chapter_two;

/**
 * Find the number and sorts them in ascending order
 * @author Max Ivanov
 * @version 0.1
 * @see ATwo - executes class FinderNubmer
 */
public class FinderNumber {
    /**
     * Find element inside array and print the results
     * @param seq array of String where you want to search
     */
    void FNum(String[] seq) {
        for (String s : seq) {
            boolean check = false;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i - 1) >= s.charAt(i)) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            if (check) {
                System.out.println(s);
                break;
            }
        }
    }
}
