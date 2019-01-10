package com.gildedrose;

public class Brie extends Product {
    public Brie(Item item) {
        super(item);
    }

    public void updateQuality () {
        this.item.sellIn--;
        if (this.item.quality < 50) {
            this.item.quality++;
        }
    }
}
