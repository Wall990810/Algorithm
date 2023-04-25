package com.wall.base.sort;

import org.junit.jupiter.api.Test;

class BubbleSortTest extends AbstractSortTest {
    @Test
    void accept() {
        BubbleSort bubbleSort = new BubbleSort();
        array = bubbleSort.accept(array);
        checkArray();
    }

    @Test
    @Override
    void emptyTest() {
        BubbleSort bubbleSort = new BubbleSort();
        array = bubbleSort.accept(new int[0]);
        checkArray();
    }

    @Test
    @Override
    void singleTest() {
        BubbleSort bubbleSort = new BubbleSort();
        array = bubbleSort.accept(new int[]{});
        checkArray();
    }
}