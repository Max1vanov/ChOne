package ivanov.maks.chapter_three.a_one;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatingStudent {
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> stList = new ArrayList<Student>();

    public void create() {
        try {

            Student student = new Student();

            System.out.println("Enter name: ");
            student.setName(scanner.nextLine());
            System.out.println("Enter surname: ");
            student.setSurname(scanner.nextLine());
            System.out.println("Enter patronymic: ");
            student.setPatronymic(scanner.nextLine());
            //System.out.println("Enter birthday: ");
            //student.setBirthday(scanner.nextLine());
            System.out.println("Enter address: ");
            student.setAddress(scanner.nextLine());
            System.out.println("Enter phone: ");
            student.setPhone(scanner.nextLine());
            System.out.println("Enter faculty: ");
            student.setFaculty(scanner.nextLine());
            System.out.println("Enter course: ");
            student.setCourse(scanner.nextLine());
            System.out.println("Enter group: ");
            student.setGroup(scanner.nextLine());
            stList.add(student);
            //scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Student> getStList() {
        return stList;
    }
}
