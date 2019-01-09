package com.gildedrose;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    void test1() {
        Item[] items = new Item[] { new Item("Aging Red Wine", -102, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(4);
    }

    @Test
    void test2() {
        Item[] items = new Item[] { new Item("Aging Red Wine", -50, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(6);
    }

    @Test
    void test3() {
        Item[] items = new Item[] { new Item("Aging Red Wine", 8, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality).isEqualTo(5);
    }

}
