public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // WITHOUT Singleton

        LoggerWithoutSingleton loggerWithoutSingleton1 = new LoggerWithoutSingleton();
        LoggerWithoutSingleton loggerWithoutSingleton2 = new LoggerWithoutSingleton();

        if(loggerWithoutSingleton1 == loggerWithoutSingleton2){
            System.out.println("Both the instance of logger is same");
        }else{
            System.out.println("Both the logger is different instance of logger");
        }

        // With Singleton

        Logger logger1 = Logger.getInstance();

        Logger logger2 = Logger.getInstance();

        if(logger1 == logger2){
            System.out.println("Both the instance of logger is same");
        }else{
            System.out.println("Both the logger is different instance of logger");
        }
    }
}
