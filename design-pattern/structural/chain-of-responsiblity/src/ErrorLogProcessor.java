public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor next){
        super(next);
    }   
    @Override
    public void log(String level, String msg){
        if(App.ERROR.equals(level)){
            System.out.println("ERROR: "+msg);
        }else{
            super.log(level, msg);
        }
    }
}
