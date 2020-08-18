package roman_zverev;

import roman_zverev.implementation.Ranger;
import roman_zverev.implementation.Warrior;
import roman_zverev.implementation.Wizard;

public class Main {

    public static void main(String[] args) {
        Wizard wizard = new Wizard("Гэндальф", 'm');
        wizard.run();
        wizard.jump();
        wizard.swim();
        wizard.shoot();

        System.out.println("--**--**--**--**--**--**--**--**--**--**--**--**--\n");

        Ranger ranger = new Ranger("Арвен", 'w');
        ranger.run();
        ranger.jump();
        ranger.swim();
        ranger.shoot();

        System.out.println("--**--**--**--**--**--**--**--**--**--**--**--**--\n");

        Warrior warrior = new Warrior("Эомер", 'm');
        ranger.run();
        ranger.jump();
        ranger.swim();
        ranger.shoot();
    }
}
