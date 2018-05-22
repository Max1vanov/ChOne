package ivanov.maks.chapter_three.a_one;

public class ReturnStudent {
    public static void main(String[] args) {
        String[][] act = {
                {"name", "=", "Ivan"},
                {"group", "=", "one"}
        };
        CreatingStudent creatingStudent = new CreatingStudent();
        creatingStudent.create();
        creatingStudent.create();
        //creatingStudent.create();
        //creatingStudent.create();
        //creatingStudent.create();
        FindStudent findStudent = new FindStudent();
        PrintList printList = new PrintList();
        printList.printStudent(creatingStudent.getStList());
        SortStud sortStud = new SortStud();
        printList.printStudent(sortStud.Sort(creatingStudent.getStList(), act));


    }
}