package oop;

public class Time {
    private int hour;
    private int minute;
    private float second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0)
            return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 59 || minute < 0)
            return;
        this.minute = minute;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        if (second >= 60f || second < 0.0f)
            return;
        this.second = second;
    }

}
