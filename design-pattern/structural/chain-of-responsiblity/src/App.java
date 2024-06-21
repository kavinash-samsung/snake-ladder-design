public class App {
    static String INFO = "INFO";
    static String WARN = "WARN";
    static String ERROR = "ERROR";
    static String DANGER = "DANGER";
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LogProcessor logProcessor = new InfoLogProcessor(new WarnLogProcessor(new ErrorLogProcessor(new DangerLogProcessor(null))));

        logProcessor.log(INFO, "There is a log for simple request");
        logProcessor.log(ERROR, "There is an error in your application");
    }
}
