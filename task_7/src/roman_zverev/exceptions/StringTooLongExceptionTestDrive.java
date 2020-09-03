package roman_zverev.exceptions;

//Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTooLongExceptionTestDrive {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void inputBio() throws StringTooLongException, IOException {
        System.out.print("Tell us about yourself: ");
        String bio = reader.readLine();

        if(bio.length() > 100){
            throw new StringTooLongException();
        }else{
            System.out.println("Ok!");
        }
    }




}
