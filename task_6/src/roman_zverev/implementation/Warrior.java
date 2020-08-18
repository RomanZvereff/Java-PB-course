package roman_zverev.implementation;

import roman_zverev.personage.Archetype;
import roman_zverev.personage.Durable;
import roman_zverev.personage.Personage;

public class Warrior extends Personage implements Durable {

    public Warrior(String nickName, char gender) {
        super(nickName, gender, Archetype.WARRIOR);
        System.out.println(toString());
    }

    @Override
    public void run() {
        System.out.println(super.getNickName() + " бегает медленно из-за тяжёлой брони.");
    }

    @Override
    public void jump() {
        System.out.println(super.getNickName() + " неторопливо перелазит через скалы.");
    }

    @Override
    public void swim() {
        System.out.println(super.getNickName() + " не может плыть в своей тяжелой броне.");
    }

    @Override
    public void shoot() {
        String str = (super.getGender() == 'm' ? " уничтожил " : " уничтожила ");
        damageReduction();
        System.out.println(super.getNickName() + str + " врага");
    }

    @Override
    public void damageReduction() {
        System.out.print("Получает минимальный урон нанесенный врагом.");
    }

    @Override
    public String toString() {
        String genderName = (super.getGender() == 'm' ? "мужчина " : "женщина ");
        return "Тип персонажа: " + super.getArchetype().getName()
                + "\n Имя: " + super.getNickName()
                + "\n Пол: " + genderName
                + "\n Сила: " + super.getArchetype().getStrength()
                + "\n Ловкость: " + super.getArchetype().getAgility()
                + "\n Интеллект: " + super.getArchetype().getIntelligence();
    }
}
