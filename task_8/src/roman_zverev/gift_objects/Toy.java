package roman_zverev.gift_objects;

import roman_zverev.generics.GiftTypes;
import roman_zverev.generics.Human;

public class Toy {

    private Human giver;
    private GiftTypes type;

    public Toy(GiftTypes type) {
        this.type = type;
    }

    public Human getGiver() {
        return giver;
    }

    public void setGiver(Human giver) {
        this.giver = giver;
    }

    public GiftTypes getType() {
        return type;
    }

    public void setType(GiftTypes type) {
        this.type = type;
    }
}
