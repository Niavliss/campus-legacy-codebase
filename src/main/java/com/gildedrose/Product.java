package com.gildedrose;

public class Product {

    public Item item;

    public Product (Item item) {
        this.item = item;
    }

    public void updateQuality () {
        this.item.sellIn--;
        if (this.item.quality > 0) {
            this.item.quality--;
        }
    }


}
