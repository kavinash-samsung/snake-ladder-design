
public class DangerLogProcessor extends LogProcessor{
    public DangerLogProcessor(LogProcessor next){
        super(next);
    }   
    @Override
    public void log(String level, String msg){
        if(App.DANGER.equals(level)){
            System.out.println("DANGER: "+msg);
        }else{
            super.log(level, msg);
        }
    }
}
