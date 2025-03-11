package inter;

interface Soundable {
    String sound();
}

class SoundableEx {
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }

    static void printSound(Soundable sound) {
        System.out.println(sound.sound());
    }
}

class Cat implements Soundable {
    @Override
    public String sound() {
        return "야옹야옹";
    }
}

class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍멍";
    }
}