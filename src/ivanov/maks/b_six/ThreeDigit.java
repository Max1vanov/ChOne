package ivanov.maks.b_six;

public class ThreeDigit {
    public void findFigure(int[] seq) {
        for (int s :
                seq) {
            int t = s;
            //System.out.println(t);
            int count = 0;
            while (t > 0) {
                t /= 10;
                //System.out.println(t);
                count++;
            }
            if (count == 3) {
                if (s / 100 != (((s / 10) - ((s / 100) * 10))) && (((s / 10) - ((s / 100) * 10)) != (s - ((s / 10) * 10))) && (s / 100 != (s - ((s / 10) * 10)))) {
                    System.out.print(s + " ");
                }
            }
        }
    }
}
