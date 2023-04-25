package com.wall.base.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest extends AbstractSortTest {

    @Test
    void accept() {
        InsertSort insertSort = new InsertSort();
        array = insertSort.accept(array);
        checkArray();
    }

    @Test
    @Override
    void emptyTest() {
        InsertSort insertSort = new InsertSort();
        array = insertSort.accept(new int[0]);
        checkArray();
    }

    @Test
    @Override
    void singleTest() {
        InsertSort insertSort = new InsertSort();
        array = insertSort.accept(new int[]{1});
        checkArray();
    }
}