
public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor next){
        super(next);
    }   
    @Override
    public void log(String level, String msg){
        if(App.INFO.equals(level)){
            System.out.println("Info: "+msg);
        }else{
            super.log(level, msg);
        }
    }
}
