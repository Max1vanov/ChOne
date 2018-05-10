package ivanov.maks.b_two;

class MaxM {
    void max(int[] seq) {
        int t = Integer.MIN_VALUE;
        for (int s :
                seq) {
            if (t < s) {
                t = s;
            }
        }
        System.out.println("Max member value of array is " + t);
    }

    void max(String[] stSeq) {
        int t = Integer.MIN_VALUE;
        for (String s :
                stSeq) {
            if (t < Integer.parseInt(s)) {
                t = Integer.parseInt(s);
            }
        }
        System.out.println("Max member value of array is " + t);
    }
}
