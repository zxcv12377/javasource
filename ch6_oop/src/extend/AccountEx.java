package extend;

public class AccountEx {
    public static void main(String[] args) {
        // 부모의 인스턴스도 같이 생성됨
        // #region CHEKING ACCOUNT
        // CheckingAccount cAccount = new CheckingAccount(
        // "110-11", "kim", 10000, "123-1232");

        // System.out.println("계좌번호 : " + cAccount.getAno());
        // System.out.println("계좌주 : " + cAccount.getOwner());
        // System.out.println("잔액 : " + cAccount.getBalance());
        // System.out.println("체크카드번호 : " + cAccount.getCardNo());

        // try {
        // System.out.println("현재 잔액 : " + cAccount.pay("123-1232", 500));
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // #endregion

        // #region CREDIT LINE ACCOUNT
        // CreditLineAccount creditLineAccount = new CreditLineAccount(
        // "110-11", "Hong", 5000, 10000);

        // try {
        // creditLineAccount.withdraw(8000);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // System.out.println("현재 잔액 : " + creditLineAccount.getBalance());
        // #endregion

        // #region BONUS POINT ACCOUNT
        // BonusPointAccount bonusPointAccount = new BonusPointAccount(
        // "110-11", "kim", 10000, 1000);

        // bonusPointAccount.deposit(10000);
        // System.out.println("현재 잔액 : " + bonusPointAccount.getBalance());
        // #endregion

        // #region CHECK TRAFFIC ACCOUNT
        CheckingTrafficAccount chkTrafficAccount = new CheckingTrafficAccount(
                "110-11", "kim", 10000, "123-1232", false);
        CheckingTrafficAccount chkTrafficAccount2 = new CheckingTrafficAccount(
                "110-11", "kim", 10000, "123-1232", true);
        try {
            System.out.println("교통카드 지불 후 현재 잔액 : " + chkTrafficAccount2.trafficPay("123-1232", 1500));
            System.out.println("현재 잔액 : " + chkTrafficAccount.trafficPay("123-1232", 500));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // #endregion
    }
}