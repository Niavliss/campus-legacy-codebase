package com.gildedrose;

import java.util.List;

public class Product {

    public Item item;
    public List<Rule> rules;

    public Product (Item item, List<Rule> rules) {
        this.item = item;
        this.rules = rules;
    }

    public void updateQuality () {
        this.item.sellIn--;
        if (this.item.quality > 0) {
            this.item.quality--;
        }
    }


}
