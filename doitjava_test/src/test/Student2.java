package test;

public class Student2 {
    public static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public Student2() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static int getSerialNum(){
        int i = 10;
        return serialNum;
    }
    
    public static void setSerialNum(int serialNum){
        Student2.serialNum = serialNum;
    }
}


