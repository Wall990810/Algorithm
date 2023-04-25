package com.wall.base.sort;

/**
 * 冒泡排序
 *
 * 从首位开始与次位进行比较，如果大于下一位则进行交换，将最大值聚集与数据后端
 *
 * @author Wall
 * @date 2023/3/17
 * @version: 1.0
 */
public class BubbleSort implements Sort {
    @Override
    public int[] accept(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            boolean haveSwap = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int m = array[j];
                    array[j + 1] = array[j];
                    array[j] = m;
                    haveSwap = true;
                }
            }
            if (!haveSwap) {
                break;
            }
        }
        return array;
    }
}
