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
        logger.info("Toto",this.item.sellIn);
        if (this.item.sellIn < 0 && this.item.sellIn >= -100) {
            logger.info("Tata",this.item.sellIn);
            this.item.quality ++;
        } else if (this.item.sellIn < -100) {
            logger.info("Tutu",this.item.sellIn);
            this.item.quality --;
        }
    }

}
