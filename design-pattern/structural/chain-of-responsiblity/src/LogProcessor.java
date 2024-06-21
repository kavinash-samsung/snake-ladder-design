public abstract class LogProcessor {

    private final LogProcessor next;

    public LogProcessor(LogProcessor next){
        this.next = next;
    }

    public void log(String level, String msg){
        if(next != null){
            this.next.log(level, msg);
        }
    }
    
} 