package roman_zverev.personage;

public abstract class Personage  {

    String nickName;
    char gender;
    Archetype archetype;

    public Personage(String nickName, char gender, Archetype archetype) {
        this.nickName = nickName;
        this.gender = gender;
        this.archetype = archetype;
        System.out.println("Создан персонаж по имени: " + nickName + " - " + archetype.getName());
    }

    public abstract void run();

    public abstract void jump();

    public abstract void swim();

    public abstract void shoot();

    public String getNickName() {
        return nickName;
    }

    public char getGender() {
        return gender;
    }

    public Archetype getArchetype() {
        return archetype;
    }
}
