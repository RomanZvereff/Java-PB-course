package roman_zverev.logging;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerTestDrive {

    public static void main(String[] args) throws IOException {
        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration(new FileInputStream(Paths.get("src\\roman_zverev\\logging\\log.properties").toFile()));

        Logger logger = Logger.getLogger(LoggerTestDrive.class.getName());

        logger.log(Level.SEVERE, "test");
    }


}
