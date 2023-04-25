package com.wall.base.sort;

/**
 * 插入排序
 *
 * 从首位开始遍历比较，将自身与左边数据做比较，直到大于某个数据，交换至其右边
 *
 * @author Wall
 * @date 2023/3/17
 * @version: 1.0
 */
public class InsertSort implements Sort{

    @Override
    public int[] accept(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }

        for (int i = 1; i < array.length; i++) {
            int p = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[p] < array[j]) {
                    int m = array[p];
                    array[p] = array[j];
                    array[j] = m;
                    p = j;
                } else {
                    break;
                }
            }
        }
        return array;
    }
}
