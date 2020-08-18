package roman_zverev.implementation;

import roman_zverev.personage.Archetype;
import roman_zverev.personage.Magician;
import roman_zverev.personage.Personage;

public class Wizard extends Personage implements Magician {

    public Wizard(String nickName, char gender) {
        super(nickName, gender, Archetype.WIZARD);
        System.out.println(toString());
    }

    @Override
    public void run() {
        System.out.println(super.getNickName() + " бегает очень медленно.");
    }

    @Override
    public void jump() {
        String str = (super.getGender() == 'm' ? "он слишком стар " : "она слишком стара ");
        System.out.println(super.getNickName() + " - " + super.getArchetype().getName() + ", " + str + "для прыжков.");
    }

    @Override
    public void swim() {
        String str = (super.getGender() == 'm' ? " наколдовал " : " наколдовала ");
        System.out.println(super.getNickName() + str + " лодку и плывет по реке.");
    }

    @Override
    public void shoot() {
        System.out.print(super.getNickName() + " выстрелил из соего посоха. ");
        enchantEnemy();
    }

    @Override
    public void enchantEnemy() {
        System.out.println("Враг превталился в барана.");
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
