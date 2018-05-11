package ivanov.maks.chapter_one.a_one;

import java.util.Scanner;

class NameMessage {

     void Message() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        System.out.println("Your name is " + scanner.next());
        scanner.close();
    }
}
