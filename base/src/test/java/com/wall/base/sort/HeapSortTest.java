package com.wall.base.sort;

import org.junit.jupiter.api.Test;

class HeapSortTest extends AbstractSortTest {

    @Test
    void accept() {
        HeapSort heapSort = new HeapSort();
        array = heapSort.accept(array);
        checkArray();
    }

    @Test
    @Override
    void emptyTest() {
        HeapSort heapSort = new HeapSort();
        array = heapSort.accept(new int[0]);
        checkArray();
    }

    @Test
    @Override
    void singleTest() {
        HeapSort heapSort = new HeapSort();
        array = heapSort.accept(new int[]{1});
        checkArray();
    }
}