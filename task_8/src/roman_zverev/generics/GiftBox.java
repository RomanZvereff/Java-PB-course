package roman_zverev.generics;

import roman_zverev.gift_objects.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class GiftBox<T extends Toy> {

    private List<T> gifts;

    public GiftBox(){
        gifts = new ArrayList<>();
    }

    public void putGift(T gift) {
        gifts.add(gift);
    }

    public T getGift(int index) {
        return gifts.get(index);
    }

    public void putAllGifts(List<? extends T> list) {
        gifts.addAll(list);
    }

    public void forEach(Consumer<? super T> consumer) {
        for(T gift : gifts){
            consumer.accept(gift);
        }
    }

}
