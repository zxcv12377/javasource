package oop;

// private : 외부 클래스에서 접근 불가

// protect : 
// public : private의 반대(접근 제한이 없음) 개념

public class Tv3 {
    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    // 초기화 - 생성자 제공
    public Tv3() {

    }

    public Tv3(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
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
