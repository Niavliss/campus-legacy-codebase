package com.gildedrose;

import com.google.common.collect.Range;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    final static Logger logger = LoggerFactory.getLogger(GildedRose.class);
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    private List<Rule> selectRules(Item item) {
        switch (item.name) {
//            case "Aged Brie":
//                return new Brie(item);
//            case "Sulfuras":
//                return new Sulfuras(item);
//            case "Backstage passes to a TAFKAL80ETC concert":
//                return new Backstage(item);
//            case "Conjured":
//                return new Conjured(item);
//            case "Aging Red Wine":
//                return new Wine(item);
            default :
                List<Rule> rules = new ArrayList<>();
                Rule rule = new Rule(Range.all(), _item -> _item.quality--);
                rules.add(rule);
                return rules;
        }
    }


    public void updateQuality () {
        for (Item item : items) {
            List<Rule> rules = this.selectRules(item);
            for (int i = 0; i < rules.size(); i++) {
                if (rules.get(i).integerRange.contains(item.sellIn)) {
                    rules.get(i).consumer.accept(item);
                }
            }
        }

    }

    public Item[] getItems() {
        return items;
    }
}