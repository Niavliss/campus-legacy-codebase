package com.gildedrose;

public class Backstage extends Product {
    public Backstage(Item item) {
        super(item);
    }

    public void updateQuality() {
        this.item.sellIn--;

        if (this.item.sellIn >= 0) {
            if (this.item.quality < 50) {
                if (this.item.sellIn < 11 && this.item.sellIn >= 5 && this.item.quality <= 48) {
                    this.item.quality = this.item.quality + 2;
                } else if (this.item.sellIn < 6 && this.item.quality <= 47) {
                    this.item.quality = this.item.quality + 3;
                } else {
                    this.item.quality++;
                }
            }
        } else {
            this.item.quality = 0;
        }
    }

}
