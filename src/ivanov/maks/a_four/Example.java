package ivanov.maks.a_four;

import java.time.LocalDateTime;
import java.util.Scanner;

class Example {

    private LocalDateTime start;
    private String name;

    void enterName() {
        start = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.next();
    }

    void enterEx() {
        LocalDateTime finish = LocalDateTime.now();
        System.out.println("OK");
        System.out.println();
        System.out.println("You started at " + start);
        System.out.println("Your name is: " + name);
        System.out.println("You finished at " + finish);
    }
}
