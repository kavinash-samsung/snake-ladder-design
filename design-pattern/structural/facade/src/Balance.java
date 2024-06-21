public class Balance {
    public int getBalance(String accountId){
        System.out.println("Return balace for "+accountId);
        return 1000;
    }

    public void deductBalance(String accountId, float amount){
        System.out.println("Deducting "+amount+" from "+accountId+" account");
    }
}
