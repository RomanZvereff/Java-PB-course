package roman_zverev.personage;

public enum Archetype {

    WARRIOR(97, 65, 30, "Воин"),
    RANGER(55, 95, 75, "Следопыт"),
    WIZARD(65, 25, 99, "Маг");

    private int strength;
    private int agility;
    private int intelligence;
    private String name;

    Archetype(int strength, int agility, int intelligence, String name) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public String getName() {
        return name;
    }
}
