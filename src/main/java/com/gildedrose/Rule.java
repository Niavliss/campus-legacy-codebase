package com.gildedrose;

import com.google.common.collect.Range;

import java.util.function.Consumer;

public class Rule {

    public Range<Integer> integerRange;
    public Consumer<Item> consumer;

    public Rule (Range<Integer> integerRange, Consumer<Item> function) {
        this.integerRange = integerRange;
        this.consumer = function;
    }

    public boolean isBetweenRangeGoFunction(int sellIn) {
        return this.integerRange.contains(sellIn);
    }
}
