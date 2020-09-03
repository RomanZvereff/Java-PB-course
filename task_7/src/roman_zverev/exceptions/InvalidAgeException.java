package roman_zverev.exceptions;

public class InvalidAgeException extends Exception {

    private int age;

    public InvalidAgeException(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getMessage(){
        String message = "Age value: " + age + " is not valid for this resource!";
        return message;
    }


}
