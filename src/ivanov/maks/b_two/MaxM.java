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
}
