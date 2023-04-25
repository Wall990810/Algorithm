package com.wall.base.sort;

/**
 * 希尔排序
 *
 * 插入排序变种，首先进行数据分组的进行局部插入排序，最终粒度到达1时直接完成
 *
 * @author Wall
 * @date 2023/3/17
 * @version: 1.0
 */
public class ShellSort implements Sort{
    @Override
    public int[] accept(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }

        int gap = 2;
        int perPartSize = array.length / gap;
        while (perPartSize >= 1) {
            for (int i = perPartSize; i < array.length; i++) {
                int p = i;
                for (int j = i - perPartSize; j >= 0 ; j -= perPartSize) {
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

            gap *= 2;
            perPartSize = array.length / gap;
        }

        return array;
    }
}
