package roman_zverev.exceptions;

import java.util.Scanner;

public class InvalidAgeExceptionTestDrive {

    static Scanner scanner = new Scanner(System.in);

    public static void inputAge() throws InvalidAgeException{
        System.out.print("Input your age: ");
        int age = scanner.nextInt();
        if(age < 18 || age > 99){
           throw new InvalidAgeException(age);
        }else{
            System.out.println("Welcome!");
        }
    }

}
