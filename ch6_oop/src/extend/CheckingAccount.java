package extend;

public class CheckingAccount extends Account {
    private String cardNo;

    // public CheckingAccount() {
    // // 부모의 default 생성자 호출
    // super();
    // }

    public CheckingAccount(String ano, String owner, long balance, String cardNo) {
        super(ano, owner, balance);
        this.cardNo = cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public long pay(String cardNo, int amount) throws Exception {
        if (!(this.cardNo.equals(cardNo)) || getBalance() < amount) {
            throw new Exception("cardNo나 잔액을 확인해 주세요");
        }
        withdraw(amount);
        return getBalance();
    }
}
