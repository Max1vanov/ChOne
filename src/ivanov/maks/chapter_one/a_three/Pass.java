package ivanov.maks.chapter_one.a_three;

import java.util.Scanner;

class Pass {
    private String pass;

    {
        pass = "12345";
    }

    private String yourPass;
    private Scanner scanner = new Scanner(System.in);

    void enterYourPass() {
        System.out.print("Enter your password: ");
        yourPass = scanner.next();
        scanner.close();
    }

    void passEqual() {
        if (pass.equals(yourPass)) {
            System.out.println("Hello!");
        } else {
            System.err.println("Wrong password!");
        }
    }
}
