package com.wall.base.sort;

import org.junit.jupiter.api.Test;

class BucketSortTest extends AbstractSortTest{
    @Test
    void accept() {
        BucketSort bucketSort = new BucketSort();
        array = bucketSort.accept(array);
        checkArray();
    }

    @Test
    @Override
    void emptyTest() {
        BucketSort bucketSort = new BucketSort();
        array = bucketSort.accept(new int[0]);
        checkArray();
    }

    @Test
    @Override
    void singleTest() {
        BucketSort bucketSort = new BucketSort();
        array = bucketSort.accept(new int[]{1});
        checkArray();
    }
}