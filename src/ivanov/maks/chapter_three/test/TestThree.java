package ivanov.maks.chapter_three.test;

enum Numbers {
    ONE, TWO, THREE, FOUR, FIVE
}
public class TestThree{
    public static void main(String[] args) {
        Numbers n1 = Numbers.ONE;
        Numbers n2 = Numbers.ONE;
        if (n1 == n2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(Numbers.FIVE.ordinal());

    }
}
