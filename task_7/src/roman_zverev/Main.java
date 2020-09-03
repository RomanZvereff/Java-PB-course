package roman_zverev;

import roman_zverev.exceptions.InvalidAgeException;
import roman_zverev.exceptions.InvalidAgeExceptionTestDrive;
import roman_zverev.exceptions.StringTooLongException;
import roman_zverev.exceptions.StringTooLongExceptionTestDrive;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try{
            InvalidAgeExceptionTestDrive.inputAge();
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        //use Lorem sample in StringTooLongExceptionTestDrive.java
        try{
            StringTooLongExceptionTestDrive.inputBio();
        } catch(StringTooLongException e){
            System.out.println(e.getMessage());
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
