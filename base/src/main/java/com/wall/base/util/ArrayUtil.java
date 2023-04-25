package com.wall.base.util;

/**
 * 数组操作工具
 *
 * @author Wall
 * @date 2023/3/17
 * @version: 1.0
 */
public class ArrayUtil {

    public static <T> void swap(T[] array, int i1, int i2) {
        int l = array.length;
        if (l < i1  || l < i2) {
            throw new IllegalArgumentException(
                    String.format("select index can't larger than array length! index1: %s, index2: %s, array length:%s", i1, i2, l));
        }

        T m = array[i1];
        array[i1] = array[i2];
        array[i2] = m;
    }
}
