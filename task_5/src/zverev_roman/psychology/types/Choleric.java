package zverev_roman.psychology.types;

import zverev_roman.psychology.ActivityTypes;
import zverev_roman.psychology.Temperament;
import zverev_roman.psychology.TemperamentTypes;

import java.util.Arrays;
import java.util.Objects;

public class Choleric extends Temperament {

    public Choleric() {
        super.setName(TemperamentTypes.CHOLERIC.toString());
    }

    @Override
    public void toBehave() {
        System.out.println(super.getName() + " ведет себя как " + ActivityTypes.STRONG.toString().toLowerCase() + ", "
                + ActivityTypes.UNBALANCED.toString().toLowerCase());
    }

    @Override
    public String toString() {
        return "Класс - Choleric {field name = "
                + super.getName()
                + "; method = " + Arrays.toString(super.getClass().getDeclaredMethods()) + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || (getClass() != obj.getClass())) return false;
        Choleric choleric = (Choleric) obj;
        return Objects.equals(super.getName(), choleric.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName());
    }
}
