package com.gildedrose;

public class Conjured extends Product {
    public Conjured(Item item) {
        super(item);
    }

    public void updateQuality () {
        this.item.sellIn--;

        if (this.item.quality > 0) {
            if (this.item.quality > 1) {
                this.item.quality = this.item.quality -2;
            } else {
                this.item.quality --;
            }
        }
    }

}
