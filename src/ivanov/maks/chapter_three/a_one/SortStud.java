package ivanov.maks.chapter_three.a_one;

import java.util.ArrayList;

public class SortStud {
    private FindStudent findStudent = new FindStudent();
    private static ArrayList<Student> stu;
    public ArrayList<Student> Sort(ArrayList<Student> st, String[]... set) {
        stu = st;
        //System.out.println(set.length / 3);
        //System.out.println(set.length % 3);
        //if ((set.length / 3) >= 1 && (set.length % 3 == 0)) {
           /* for (int i = 0; i < set.length; i+=3) {
                stu = findStudent.sortStudent(stu, set[i], set[i+1], set[i+2]);
            }*/
        for (int i = 0; i < set.length; i++) {
            if (set[i].length == 3) {
                for (int j = 0; j < set[i].length; j += 3) {
                    stu = findStudent.sortStudent(stu, set[i][j], set[i][j + 1], set[i][j + 2]);
                }
            } else {
                System.out.println("Don't right act in row " + i);
            }
        }
        //}
        return stu;
    }
}
