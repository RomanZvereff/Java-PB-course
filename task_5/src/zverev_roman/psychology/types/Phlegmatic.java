package zverev_roman.psychology.types;

import zverev_roman.psychology.ActivityTypes;
import zverev_roman.psychology.Temperament;
import zverev_roman.psychology.TemperamentTypes;

import java.util.Arrays;
import java.util.Objects;

public class Phlegmatic extends Temperament {

    public Phlegmatic() {
        super.setName(TemperamentTypes.PHLEGMATIC.toString());
    }

    @Override
    public void toBehave() {
        System.out.println(super.getName() + " ведет себя как " + ActivityTypes.STRONG.toString().toLowerCase() + ", "
                + ActivityTypes.BALANCED.toString().toLowerCase() + ", " + ActivityTypes.INERT.toString().toLowerCase());
    }

    @Override
    public String toString() {
        return "Класс - Phlegmatic {field name = "
                + super.getName()
                + "; method = " + Arrays.toString(super.getClass().getDeclaredMethods()) + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || (getClass() != obj.getClass())) return false;
        Phlegmatic phlegmatic = (Phlegmatic) obj;
        return Objects.equals(super.getName(), phlegmatic.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName());
    }

}
