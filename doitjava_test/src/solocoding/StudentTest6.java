package solocoding;

public class StudentTest6 {

    public static void main(String[] args) {
        Student4 studentShim = new Student4();
        studentShim.SetStudentName("심현진");
        System.out.println(Student4.GetSerialNum());
        System.out.println(studentShim.studentName + "의 카드 번호 : " + studentShim.cardNum);

        Student4 studentSon = new Student4();
        studentSon.SetStudentName("손흥민");
        System.out.println(Student4.GetSerialNum());
        System.out.println(studentSon.studentName + "의 카드 번호 : " + studentSon.cardNum);
    }
}