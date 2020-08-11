package zverev_roman.reflection;

public class Reflection {

    String test;

    public Reflection(String test) {
        System.out.println("Создан объект Reflection");
        this.test = test;
    }

    public void getSomething(){
        System.out.println("Метод getSomething выполнен");
    }
}
