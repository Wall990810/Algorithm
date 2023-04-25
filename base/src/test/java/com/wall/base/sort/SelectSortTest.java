package com.wall.base.sort;

import org.junit.jupiter.api.Test;

class SelectSortTest extends AbstractSortTest{
    @Test
    void accept() {
        SelectSort selectSort = new SelectSort();
        array = selectSort.accept(array);
        checkArray();
    }

    @Test
    @Override
    void emptyTest() {
        SelectSort selectSort = new SelectSort();
        array = selectSort.accept(new int[0]);
        checkArray();
    }

    @Test
    @Override
    void singleTest() {
        SelectSort selectSort = new SelectSort();
        array = selectSort.accept(new int[]{1});
        checkArray();
    }
}