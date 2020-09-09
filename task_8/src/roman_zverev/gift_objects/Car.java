package roman_zverev.gift_objects;

import roman_zverev.generics.GiftTypes;

public class Car extends Toy {

    boolean remoteControl;

    public Car(boolean remoteControl, GiftTypes type) {
        super(type);
        this.remoteControl = remoteControl;
    }

    public void go(boolean remoteControl) {
        if(remoteControl){
            System.out.println("Car is going");
        }else{
            System.out.println("Car isn't have a remote control");
        }
    }

}
