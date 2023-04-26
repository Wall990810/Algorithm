package com.wall.base.sort;

import org.junit.jupiter.api.Test;

class RadioSortTest extends AbstractSortTest{
    @Test
    void accept() {
        RadioSort radioSort = new RadioSort();
        array = radioSort.accept(array);
        checkArray();
    }

    @Test
    @Override
    void emptyTest() {
        RadioSort radioSort = new RadioSort();
        array = radioSort.accept(new int[0]);
        checkArray();
    }

    @Test
    @Override
    void singleTest() {
        RadioSort radioSort = new RadioSort();
        array = radioSort.accept(new int[]{1});
        checkArray();
    }
}