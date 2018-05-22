package ivanov.maks.chapter_three.a_one;

import java.util.Date;

public class Student {
    private static int id = 0;
    private int idStudent;
    private String name;
    private String surname;
    private String patronymic;
    //private Date birthday;
    private String address;
    private String phone;
    private String faculty;
    private String course;
    private String group;

    public Student() {
        this.idStudent = id++;
    }

    public Student(String name, String surname, String patronymic, Date  birthday, String address, String phone, String faculty, String course, String group) {
        this.idStudent = id++;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        //this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(String name, String surname, Date  birthday, String faculty, String course, String group) {
        this.idStudent = id++;
        this.name = name;
        this.surname = surname;
        this.patronymic = "";
        //this.birthday = birthday;
        this.address = "";
        this.phone = "";
        if(faculty.equals("Default")){
            this.faculty = "Math";
        } else {
            this.faculty = faculty;
        }
        if (course.equals("Default")) {
            this.course = "Programming";
        } else {
            this.course = course;
        }
        if (group.equals("Default")) {
            this.group = "New";
        } else {
            this.group = group;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    /*public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }*/

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString(){
        return "Student: { \n\tId = " + this.idStudent + "\n\tName = " + this.name +
                "\n\tSurname = " + this.surname + "\n\tPatronymic = " + this.patronymic +
                "\n\tAddress = " + this.address +
                "\n\tPhone = " + this.phone + "\n\tFaculty = " + this.faculty +
                "\n\tCourse = " + this.course + "\n\tGroup = " + this.group + "\n}\n\n*****\n";
        /*return "Student: { \n\tId = " + this.idStudent + "\n\tName = " + this.name +
                "\n\tSurname = " + this.surname + "\n\tPatronymic = " + this.patronymic +
                "\n\tBirthday = " + this.birthday + "\n\tAddress = " + this.address +
                "\n\tPhone = " + this.phone + "\n\tFaculty = " + this.faculty +
                "\n\tCourse = " + this.course + "\n\tGroup = " + this.group + "}\n\n*****\n\n";*/
    }
}