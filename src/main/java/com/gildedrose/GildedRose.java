package com.gildedrose;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    final static Logger logger = LoggerFactory.getLogger(GildedRose.class);
    List<Product> products;
    Item[] items;
    String reports;

    public GildedRose(Item[] items) {
        this.items = items;
        this.products = new ArrayList<>();
        for (int i = 0; i < this.items.length; i++) {
            switch (items[i].name) {
                case "Aged Brie":
                    Brie brie = new Brie(items[i]);
                    products.add(brie);
                    break;
                case "Sulfuras":
                    Sulfuras sulfuras = new Sulfuras(items[i]);
                    products.add(sulfuras);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    Backstage backstage = new Backstage(items[i]);
                    products.add(backstage);
                    break;
                case "Conjured":
                    Conjured conjured = new Conjured(items[i]);
                    products.add(conjured);
                    break;
                case "Aging Red Wine":
                    Wine wine = new Wine(items[i]);
                    products.add(wine);
                    break;
                default :
                    Product product = new Product(items[i]);
                    products.add(product);
                    break;
            }
        }

    }

    public void updateQuality () {
        for (Product product : this.products) {
            product.updateQuality();
        }

    }

    public Item[] getItems() {
        return items;
    }
}