package oop;

public class TimeEx {
    public static void main(String[] args) {
        Time time = new Time();
        time.setHour(11);
        time.setMinute(13);
        time.setSecond(60f);

        System.out.println("시 : " + time.getHour());
        System.out.println("분 : " + time.getMinute());
        System.out.println("초 : " + time.getSecond());
    }
}
