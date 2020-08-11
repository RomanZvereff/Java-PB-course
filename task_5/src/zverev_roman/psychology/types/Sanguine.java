package zverev_roman.psychology.types;

import zverev_roman.psychology.ActivityTypes;
import zverev_roman.psychology.Temperament;
import zverev_roman.psychology.TemperamentTypes;

import java.util.Arrays;
import java.util.Objects;

public class Sanguine extends Temperament {

    public Sanguine() {
        super.setName(TemperamentTypes.SANGUINE.toString());
    }

    @Override
    public void toBehave() {
        System.out.println(super.getName() + " ведет себя как " + ActivityTypes.STRONG.toString().toLowerCase() + ", "
                + ActivityTypes.BALANCED.toString().toLowerCase() + ", " + ActivityTypes.MOBILE.toString().toLowerCase());
    }

    @Override
    public String toString() {
        return "Класс - Sanguine {field name = "
                + super.getName()
                + "; method = " + Arrays.toString(super.getClass().getDeclaredMethods()) + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || (getClass() != obj.getClass())) return false;
        Sanguine sanguine = (Sanguine) obj;
        return Objects.equals(super.getName(), sanguine.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName());
    }

}
