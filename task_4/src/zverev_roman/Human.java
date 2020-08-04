package zverev_roman;

public class Human {

    String firstName;
    String lastName;
    int age;
    Dog dog;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setAge(int age) {
        if(age >= 18 && age <= 85){
            this.age = age;
        }else{
            System.out.println("Некорректное значение возраста для водителя.");
        }
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
