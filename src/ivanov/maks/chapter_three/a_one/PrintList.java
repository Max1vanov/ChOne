package ivanov.maks.chapter_three.a_one;

import java.util.ArrayList;

public class PrintList {
    public void printStudent(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }
}
