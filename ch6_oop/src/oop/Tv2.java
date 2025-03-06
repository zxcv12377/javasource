package oop;

// private : 외부 클래스에서 접근 불가 : 멤버변수

// protect : 
// public : private의 반대(접근 제한이 없음) 개념 : 생성자, 메서드

public class Tv2 {
    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    // 초기화 - 생성자 제공
    public Tv2() {

    }

    public Tv2(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void power() {
        power = !power;
    }

    public void changeChannel(int channel) {
        this.channel = channel;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }
}
