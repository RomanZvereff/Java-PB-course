package roman_zverev.collections;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Human implements Comparable{

    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    private String fullName;
    private LocalDate birthDate;
    private int phoneNumber;
    private String address;
    private String updatedAt;

    public Human(String fullName, LocalDate birthDate, int phoneNumber, String address) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.updatedAt = formatter.format(Calendar.getInstance().getTime());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return  "Full Name='" + fullName + '\'' +
                ", Birth Date=" + birthDate +
                ", phone number=" + phoneNumber +
                ", address='" + address + '\'' +
                ", upd: " + updatedAt;
    }

    @Override
    public int compareTo(Object o) {
        return this.getFullName().compareTo(((Human) o).getFullName());
    }
}
