package ChainOfResponsibiltyPattern;

public class CORMain {
    public void corMain() {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.INFO, "I am here is give some information!");
        logProcessor.log(LogProcessor.ERROR, "There is an error here. Please fix it!");
        logProcessor.log(LogProcessor.DEBUG, "Thank you for debugging!");

    }
}
