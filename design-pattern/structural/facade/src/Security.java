
public class Security {
    private final String code;

    public Security(String code){
        this.code = code;
    }

    public boolean verifyPin(String pin){
        return pin.equals(this.code);
    }
}
