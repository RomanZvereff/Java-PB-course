package roman_zverev;

import roman_zverev.collections.PhoneBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IOException {

        int menuItem = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addSubscriber("Gates Bill", LocalDate.parse("1965-06-28"), 981234567, "address, 1, 71");
        phoneBook.addSubscriber("Conor Sarah", LocalDate.parse("1983-01-01"), 668962547, "Los Angeles");

        while(true){
            System.out.println("Menu:");
            System.out.println("1 - add new Subscriber");
            System.out.println("2 - remove Subscriber");
            System.out.println("3 - search Subscriber");
            System.out.println("4 - get all Subscriber");
            System.out.println("5 - edit Subscriber");
            System.out.println("6 - EXIT");
            System.out.print("Enter number here:");

            menuItem = Integer.parseInt(reader.readLine());

            if(menuItem == 1){
                /*  Gosling James
                    1955-05-19
                    5555555
                    Калгари, Альберта, Канада
                 * */
                System.out.println("Enter info");
                System.out.print("Full name: ");
                String fullName = reader.readLine();
                System.out.print("Birth date (yyyy-mm-dd): ");
                LocalDate birthDate = LocalDate.parse(reader.readLine());
                System.out.print("Phone number: +380");
                int phoneNum = Integer.parseInt(reader.readLine());
                System.out.print("Address: ");
                String address = reader.readLine();

                phoneBook.addSubscriber(fullName, birthDate, phoneNum, address);
            }else if(menuItem == 2){
                System.out.print("Enter Full name to remove: ");
                phoneBook.removeSubscriber(reader.readLine());
            }else if(menuItem == 3){
                System.out.print("Enter Full name to search: ");
                phoneBook.searchSubscriber(reader.readLine());
            }else if(menuItem == 4){
                System.out.println("All Subscribers: ");
                phoneBook.sortSubscriber();
            }else if(menuItem == 5){
                System.out.print("Enter Full name to edit: ");
                phoneBook.editSubscriber(reader.readLine());
            }else if(menuItem == 6){
                break;
            }
        }

        reader.close();
    }
}
