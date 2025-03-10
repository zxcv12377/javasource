package abstractclass;

public class PlayerEx {

    public static void main(String[] args) {
        // 인스턴스 생성 불가
        // Player player = new Player();
        Player player2 = new CDPlayer();
        player2.play();
        player2 = new AudioPlayer();
        player2.play();
    }
}
