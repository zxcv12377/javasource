package test;

public class Student1 {
    public int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public Student1() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}