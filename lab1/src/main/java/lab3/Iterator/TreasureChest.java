package lab3.Iterator;

import java.util.ArrayList;
import java.util.List;

public class TreasureChest {

    private final List<Item> items;

    public TreasureChest() {
        items = List.of(
                new Item(ItemType.POTION, "Зелье автомата по тп"),
                new Item(ItemType.RING, "Ring without shadows"),
                new Item(ItemType.POTION, "Potion to create a hummble hamster"),
                new Item(ItemType.POTION, "Potion of stupidness"),
                new Item(ItemType.WEAPON, "Common sword"),
                new Item(ItemType.RING, "Ring Ding Ding Don"),
                new Item(ItemType.WEAPON, "Almond halberd"),
                new Item(ItemType.WEAPON, "Dagger")
        );
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public Iterator<Item> iterator(ItemType itemType) {
        return (Iterator<Item>) new TChestItemIterator(this, itemType);
    }
}