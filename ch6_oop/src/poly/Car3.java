package poly;

public class Car3 {
    // 멤버 변수 타입 : 기본, 객체(대문자 시작, 배열)
    // 기본 : 정수-0 , 실수-0.0, booleadn...
    // 객체 :null;

    Tire frontleft = new HankookTire(5, "앞 왼쪽");
    Tire frontright;
    Tire backleft;
    Tire backright;

    // 초기화 1) 생성자 2) set메서드
    // 3) 멤버변수 선언하면서 초기화

    public Car3(Tire frontleft, Tire frontright, Tire backleft, Tire backright) {
        this.frontleft = frontleft;
        this.frontright = frontright;
        this.backleft = backleft;
        this.backright = backright;
    }

}
