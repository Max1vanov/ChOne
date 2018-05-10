package ivanov.maks.b_two;

class MinM {
    void min(int[] seq) {
        int t = Integer.MAX_VALUE;
        for (int s :
                seq) {
            if (t > s) {
                t = s;
            }
        }
        System.out.println("Min member value of array is " + t);
    }
}
