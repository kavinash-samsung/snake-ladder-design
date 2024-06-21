
public class WarnLogProcessor extends LogProcessor{
    public WarnLogProcessor(LogProcessor next){
        super(next);
    }   
    @Override
    public void log(String level, String msg){
        if(App.WARN.equals(level)){
            System.out.println("WARN: "+msg);
        }else{
            super.log(level, msg);
        }
    }
}
