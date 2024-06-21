public class BalanceFascade {
    Balance balance;
    Security security;
    Ledger ledger;
    Notification notification;
    public BalanceFascade(Balance balance, Security security, Ledger ledger, Notification notification){
        this.balance = balance;
        this.security = security;
        this.ledger = ledger;
        this.notification = notification;
    }
    public void deductBalance(String accountId, int amount, String pin){
        if(!security.verifyPin(pin)){
            System.out.println("Invalid pin");
            return;
        }
        if(this.balance.getBalance(accountId) < amount){
            System.out.println("Insufficient funds");
            return;
        }
        balance.deductBalance(accountId, amount);
        ledger.putEntry(String.format("Deducting %d amount from %s account", amount, accountId));
        notification.sendNotification("Balance successfully deducted");
    }
}
