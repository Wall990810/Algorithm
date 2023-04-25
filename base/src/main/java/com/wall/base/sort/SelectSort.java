package com.wall.base.sort;

/**
 * 选择排序
 * <p>
 * 遍历数组，对每个元素进行判断，选择最小值与首位交换，之后是第二小值与第二位交换，以此类推完成排序。
 *
 * @author Wall
 * @date 2023/3/17
 * @version: 1.0
 */
public class SelectSort implements Sort {

    public int[] accept(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int m = array[i];
                    array[i] = array[j];
                    array[j] = m;
                }
            }
        }

        return array;
    }
}
