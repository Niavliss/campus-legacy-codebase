package com.gildedrose;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Wine extends Product {
    final static Logger logger = LoggerFactory.getLogger(GildedRose.class);
    public Wine(Item item) {
        super(item);
    }

    public void updateQuality () {

        this.item.sellIn--;
        if (this.item.sellIn < 0 && this.item.sellIn >= -100) {
            this.item.quality ++;
        } else if (this.item.sellIn < -100) {
            this.item.quality --;
        }
    }

}
