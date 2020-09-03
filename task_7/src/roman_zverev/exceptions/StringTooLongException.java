package roman_zverev.exceptions;

public class StringTooLongException extends Exception {

    public StringTooLongException() {
    }

    public String getMessage(){
        return "The line is too long. Maximum size 100 characters.";
    }
}
