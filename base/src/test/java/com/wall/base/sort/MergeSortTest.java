package com.wall.base.sort;

import org.junit.jupiter.api.Test;

class MergeSortTest extends AbstractSortTest {
    @Test
    void accept() {
        MergeSort mergeSort = new MergeSort();
        array = mergeSort.accept(array);
        checkArray();
    }

    @Test
    @Override
    void emptyTest() {
        MergeSort mergeSort = new MergeSort();
        array = mergeSort.accept(new int[0]);
        checkArray();
    }

    @Test
    @Override
    void singleTest() {
        MergeSort mergeSort = new MergeSort();
        array = mergeSort.accept(new int[]{1});
        checkArray();
    }
}