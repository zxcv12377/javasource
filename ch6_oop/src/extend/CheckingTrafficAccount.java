package extend;

public class CheckingTrafficAccount extends CheckingAccount {
    private boolean hsTrafficCard;

    public CheckingTrafficAccount(String ano, String owner, long balance, String cardNo, boolean hsTrafficCard) {
        super(ano, owner, balance, cardNo);
        this.hsTrafficCard = hsTrafficCard;
    }

    public boolean isHsTrafficCard() {
        return hsTrafficCard;
    }

    public long trafficPay(String cardNo, int amount) throws Exception {
        if (!isHsTrafficCard()) {
            throw new Exception("교통카드 기능이 없슴");
        }
        return pay(cardNo, amount);
    }
}
