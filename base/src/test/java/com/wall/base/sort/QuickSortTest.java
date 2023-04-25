package com.wall.base.sort;

import org.junit.jupiter.api.Test;

class QuickSortTest extends AbstractSortTest{
    @Test
    void accept() {
        QuickSort quickSort = new QuickSort();
        array = quickSort.accept(array);
        checkArray();
    }

    @Test
    @Override
    void emptyTest() {
        QuickSort quickSort = new QuickSort();
        array = quickSort.accept(new int[0]);
        checkArray();
    }

    @Test
    @Override
    void singleTest() {
        QuickSort quickSort = new QuickSort();
        array = quickSort.accept(new int[]{1});
        checkArray();
    }
}