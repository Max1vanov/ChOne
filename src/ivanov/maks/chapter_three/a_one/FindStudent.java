package ivanov.maks.chapter_three.a_one;

import java.util.ArrayList;

public class FindStudent {

    public ArrayList<Student> sortStudent(ArrayList<Student> st, String type, String sign, String data) {

        ArrayList<Student> studList = new ArrayList<>();
        int count = 0;
        switch (type) {
            case "name":
                if (sign.equals("=")) {
                    for (Student aSt : st) {
                        if (aSt.getName().equals(data)) {
                            studList.add(aSt);
                            count++;
                        }
                    }
                } else if (sign.equals(">")) {

                } else if (sign.equals("<")) {

                } else {
                    System.err.println("Don't correct sign!");
                }


                if (count > 0) {
                    System.out.println("Name " + data + " have:");
                } else {
                    System.out.println("Name " + data + " have't nobody!");
                }
                break;
            case "group":
                if (sign.equals("=")) {
                    for (Student aSt : st) {

                        if (aSt.getGroup().equals(data)) {
                            studList.add(aSt);
                            count++;
                        }
                    }
                } else if (sign.equals(">")) {

                } else if (sign.equals("<")) {

                } else {
                    System.err.println("Don't correct sign!");
                }

                if (count > 0) {
                    System.out.println("Group " + data + " have:");
                } else {
                    System.out.println("Group " + data + " have't nobody!");
                }
                break;

            case "course":
                if (sign.equals("=")) {
                    for (Student aSt : st) {

                        if (aSt.getCourse().equals(data)) {
                            studList.add(aSt);
                            count++;
                        }
                    }
                } else if (sign.equals(">")) {

                } else if (sign.equals("<")) {

                } else {
                    System.err.println("Don't correct sign!");
                }

                if (count > 0) {
                    System.out.println("Course " + data + " have:");
                } else {
                    System.out.println("Course " + data + " have't nobody!");
                }
                break;
            case "faculty":
                if (sign.equals("=")) {
                    for (Student aSt : st) {

                        if (aSt.getFaculty().equals(data)) {
                            studList.add(aSt);
                            count++;
                        }
                    }
                }else if (sign.equals(">")) {

                } else if (sign.equals("<")) {

                } else {
                    System.err.println("Don't correct sign!");
                }

                if (count > 0) {
                    System.out.println("Faculty " + data + " have:");
                } else {
                    System.out.println("Faculty " + data + " have't nobody!");
                }
                break;
            case "birthday":
                if (sign.equals("=")) {
                /*for (Student aSt : st) {
                    if (aSt.getBirthday().equals(data)) {
                        studList.add(aSt);
                        course++;
                    }
                }*/
                }else if (sign.equals(">")) {

                } else if (sign.equals(">=")) {

                } else if (sign.equals("<=")) {

                } else if (sign.equals("<")) {

                } else {
                    System.err.println("Don't correct sign!");
                }
                System.out.println("Don't finish now!");
                break;
            default:
                System.err.println("Not right type!");
                break;
        }
        return studList;
    }

}

//дата
//интервал
//в алфавитном порядке
//больше чем и т.п.