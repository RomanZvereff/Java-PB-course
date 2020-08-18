package roman_zverev.implementation;

import roman_zverev.personage.Archetype;
import roman_zverev.personage.Observable;
import roman_zverev.personage.Personage;

public class Ranger extends Personage implements Observable {

    public Ranger(String nickName, char gender) {
        super(nickName, gender, Archetype.RANGER);
        System.out.println(toString());
    }

    @Override
    public void run() {
        searchForEnemies();
        System.out.println(super.getNickName() + " быстро бежит по его следам.");
    }

    @Override
    public void jump() {
        System.out.println(super.getNickName() + " перепрыгивает высокие скалы.");
    }

    @Override
    public void swim() {
        System.out.println(super.getNickName() + " плывет по течению, выслеживая врага.");
    }

    @Override
    public void shoot() {
        String str = (super.getGender() == 'm' ? " выстрелил " : " выстрелила ");
        System.out.println(super.getNickName() + str + "из лука.");
    }

    @Override
    public void searchForEnemies() {
        String str = (super.getGender() == 'm' ? " выследил " : " выследила ");
        System.out.print(super.getNickName() + str + "врага. ");
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
