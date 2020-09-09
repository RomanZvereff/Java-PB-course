package roman_zverev.generics;

import java.util.ArrayList;

public class Human {

    String name;
    boolean sex;
    int age;
    ArrayList<Human> children;

    Human(String name, boolean sex, int age, ArrayList<Human> children){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children = children;
    }

    public String toString() {
        String text = "";
        text += "Имя: " + this.name;
        text += ", пол: " + (this.sex ? "мужской" : "женский");
        text += ", возраст: " + this.age;

        if (this.children != null){
            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
        }
        return text;
    }

}
