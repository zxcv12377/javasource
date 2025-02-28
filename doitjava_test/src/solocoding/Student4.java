package solocoding;

public class Student4 {
    private static int serialNum = 100;
    public String studentName;
    public int cardNum;

    public Student4(){ // 생성자
        serialNum++;
        cardNum = serialNum;
    }

    public String GetStudentName(){
        return studentName;
    }

    public void SetStudentName(String name){
        studentName = name;
    }

    public static int GetSerialNum(){
        return serialNum;
    }

    public static void SetSerialNum(int num){
        serialNum = num;
    }
}
