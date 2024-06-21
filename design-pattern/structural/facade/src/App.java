public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String SECURITY_CODE = "124";
        Balance balance = new Balance();
        Ledger ledger = new Ledger();
        Notification notification = new Notification();
        Security security = new Security(SECURITY_CODE);

        BalanceFascade balanceFascade = new BalanceFascade(balance, security, ledger, notification);
        balanceFascade.deductBalance("1234", 50, "124");
    }
}
