package com.wall.base.sort;

/**
 * 计数排序
 *
 * @author Wall
 * @date 2023/4/26
 * @version: 1.0
 */
public class CountingSort implements Sort{
    @Override
    public int[] accept(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int max = array[0];
        int min = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }

        int tempSize = max - min + 1;
        int[] countArray = new int[tempSize];
        for (int i : array) {
            countArray[i - min] += 1;
        }

        int ai = 0;
        for (int i = 0; i < countArray.length; i++) {
            int data = i + min;
            int count = countArray[i];
            for (int j = 0; j < count; j++) {
                array[ai++] = data;
            }
        }

        return array;
    }
}
