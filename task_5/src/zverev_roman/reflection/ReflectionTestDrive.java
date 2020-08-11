package zverev_roman.reflection;

import java.lang.reflect.Constructor;

public class ReflectionTestDrive {

    public static void main(String[] args) {

        try{
            createByReflection("zverev_roman.reflection.Reflection");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void createByReflection(String path) throws Exception {
        Class clazz = Class.forName(path);
        Constructor constructor = clazz.getConstructor(new Class[]{String.class});
        Object test = constructor.newInstance("Test");
        System.out.println(test instanceof Reflection);

        Reflection reflection = (Reflection) test;
        reflection.getSomething();
    }

}
