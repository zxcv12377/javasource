package inter;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    final static int MIN_VOLUME = 0;

    void turnOn();

    void turnOff();

    public abstract void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리합니다");
        } else {
            System.out.println("무음 해체합니다");
        }
    }

    static void changeBattery() {
        System.out.println("건전지를 교환합니다");
    }
}
