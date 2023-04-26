package com.wall.base.sort;

import org.junit.jupiter.api.Test;

class CountingSortTest extends AbstractSortTest{
    @Test
    void accept() {
        CountingSort countingSort = new CountingSort();
        array = countingSort.accept(array);
        checkArray();
    }

    @Test
    @Override
    void emptyTest() {
        CountingSort countingSort = new CountingSort();
        array = countingSort.accept(new int[0]);
        checkArray();
    }

    @Test
    @Override
    void singleTest() {
        CountingSort countingSort = new CountingSort();
        array = countingSort.accept(new int[]{1});
        checkArray();
    }
}