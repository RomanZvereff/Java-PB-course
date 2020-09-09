package roman_zverev;

import roman_zverev.generics.GiftBox;
import roman_zverev.generics.GiftTypes;
import roman_zverev.gift_objects.Toy;
import roman_zverev.gift_objects.Car;
import roman_zverev.gift_objects.Constructor;
import roman_zverev.gift_objects.LegoConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<LegoConstructor> lego = new ArrayList<>();
        lego.add((new LegoConstructor(GiftTypes.CONSTRUCTOR)));
        lego.add((new LegoConstructor(GiftTypes.CONSTRUCTOR)));

        GiftBox<Toy> giftBox = new GiftBox<>();
        giftBox.putGift(new Car(true, GiftTypes.CAR));
        giftBox.putAllGifts(lego);

        Consumer<Toy> toyConsumer = new Consumer<Toy>() {
            @Override
            public void accept(Toy toy) {
                System.out.println(toy.getType());
            }
        };

        GiftBox<Constructor> constructorGiftBox = new GiftBox<>();
        constructorGiftBox.putGift(new Constructor(GiftTypes.CONSTRUCTOR));
        constructorGiftBox.putGift(new Constructor(GiftTypes.CONSTRUCTOR));
        constructorGiftBox.putGift(new Constructor(GiftTypes.CONSTRUCTOR));
        constructorGiftBox.forEach(toyConsumer);
    }

}
