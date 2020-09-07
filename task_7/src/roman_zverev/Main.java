package roman_zverev;

import roman_zverev.exceptions.InvalidAgeException;
import roman_zverev.exceptions.InvalidAgeExceptionTestDrive;
import roman_zverev.exceptions.StringTooLongException;
import roman_zverev.exceptions.StringTooLongExceptionTestDrive;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws IOException {

        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration(new FileInputStream(Paths.get("src\\roman_zverev\\logging\\log.properties").toFile()));
        Logger log = Logger.getLogger(Main.class.getName());
        try{
            InvalidAgeExceptionTestDrive.inputAge();
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
            log.log(Level.SEVERE, "Exception: ", e);
        }

        //use Lorem sample in StringTooLongExceptionTestDrive.java
        try{
            StringTooLongExceptionTestDrive.inputBio();
        } catch(StringTooLongException e){
            System.out.println(e.getMessage());
            log.log(Level.WARNING, "Warning: ", e);
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
