package zverev_roman.psychology;

public abstract class Temperament extends HigherNervousActivity {

    String name;

    public Temperament() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void toBehave();

}
