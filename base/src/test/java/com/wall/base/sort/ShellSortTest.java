package com.wall.base.sort;

import org.junit.jupiter.api.Test;

class ShellSortTest extends AbstractSortTest {

    @Test
    void accept() {
        ShellSort shellSort = new ShellSort();
        array = shellSort.accept(array);
        checkArray();
    }

    @Test
    void accept1() {
        initArray(11);
        ShellSort shellSort = new ShellSort();
        array = shellSort.accept(array);
        checkArray();
    }

    @Test
    @Override
    void emptyTest() {
        ShellSort shellSort = new ShellSort();
        array = shellSort.accept(new int[0]);
        checkArray();
    }

    @Test
    @Override
    void singleTest() {
        ShellSort shellSort = new ShellSort();
        array = shellSort.accept(new int[]{1});
        checkArray();
    }
}