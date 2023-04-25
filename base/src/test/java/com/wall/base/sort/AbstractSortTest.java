package com.wall.base.sort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Wall
 * @date 2023/3/17
 * @version: 1.0
 */
public abstract class AbstractSortTest {
    protected int[] array;

    @BeforeEach
    void initArray() {
        initArray(10);
    }

    protected void initArray(int length) {
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = length - (int) (Math.random() * length);
        }
    }


    @AfterEach
    void printArray() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i != array.length - 1) {
                builder.append(",");
            }
        }

        System.out.println(builder);
    }

    void checkArray() {
        boolean isSequence = true;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1 && !(array[i] <= array[i + 1])) {
                isSequence = false;
                break;
            }
        }

        Assertions.assertTrue(isSequence);
    }

    /**
     * 空列表检测
     */
    abstract void emptyTest();

    /**
     * 单列表检测
     */
    abstract void singleTest();
}
