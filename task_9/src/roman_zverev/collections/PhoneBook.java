package roman_zverev.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class PhoneBook {

    private List<Human> phoneBook = new ArrayList<>();

    public void addSubscriber(String fullName, LocalDate birthDate, int phoneNumber, String address) {
        Human subscriber = new Human(fullName, birthDate, phoneNumber, address);
        phoneBook.add(subscriber);
    }

    public void removeSubscriber(String fullName) {
        phoneBook.removeIf(human -> human.getFullName().equals(fullName));
    }

    public void searchSubscriber(String fullName) {
        String fullInfo = null;
        for(Human human : phoneBook){
            if(human.getFullName().equals(fullName)){
                fullInfo = human.toString();
            }
        }
        if(fullInfo == null){
            System.out.println("Not found");
        }else{
            System.out.println(fullInfo);
        }
    }

    public void sortSubscriber() {
        Collections.sort(phoneBook);
        for(Human subscriber : phoneBook){
            System.out.println(subscriber);
        }
    }

    public void editSubscriber(String fullName) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        for(Human human : phoneBook){
            if(human.getFullName().equals(fullName)){
                System.out.print("Enter new Full name: ");
                human.setFullName(reader.readLine());
                System.out.print("Enter new Birth date (yyyy-mm-dd): ");
                human.setBirthDate(LocalDate.parse(reader.readLine()));
                System.out.print("Enter new Phone number: +380");
                human.setPhoneNumber(Integer.parseInt(reader.readLine()));
                System.out.print("Enter new Address: ");
                human.setAddress(reader.readLine());
                human.setUpdatedAt(formatter.format(Calendar.getInstance().getTime()));
            }
        }
    }

}
