import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

class Logger {
  //* Singletone Instance */
  private static Logger log;

  //* Private constructor to prevent anymore instances */
  private Logger () {}

  //* Method to get singleton instance */
  public static Logger getLogInstance() {
    return log;
  }

  //* Method to write files to External Log File*/
  public void generateLog(String theLogMessage) {
    try (PrintWriter writer = new PrintWriter(new FileWriter("application.log", true))) {
            writer.println(theLogMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
  }

}


public class logSingleton {
  public static void main(String args[]) {
    Logger log = Logger.getLogInstance();

    log.generateLog("Log message 1");
    log.generateLog("Log message 2");
  }

}
