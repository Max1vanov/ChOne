package ivanov.maks.chapter_one.b_thirteen;

public class Palindrome {
    void palindrome(String[] seq) {
        for (String aSeq : seq) {
            int num = aSeq.length() / 2;
            StringBuilder head = new StringBuilder();
            StringBuilder tail = new StringBuilder();
            for (int j = 0; j < num; j++) {
                head.append(aSeq.charAt(j));
                tail.append(aSeq.charAt(aSeq.length() - 1 - j));
            }
            if (head.toString().equals(tail.toString())) {
                System.out.print(aSeq + " ");
            }

        }
    }
}
