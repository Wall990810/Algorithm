package com.wall.base.sort;

/**
 * 归并排序
 * 划分出一个个小块进行内部的排序合并
 *
 * @author Wall
 * @date 2023/3/17
 * @version: 1.0
 */
public class MergeSort implements Sort{

    @Override
    public int[] accept(int[] array) {
        return mergeSort(array, 0, array.length - 1);
    }

    private int[] mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end)/ 2;

            //左排序
            array = mergeSort(array, start, mid);
            //右排序
            array = mergeSort(array, mid + 1, end);
            //合并
            merge(array, start, mid, end);
        }

        return array;
    }

    private void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            //左边剩余附上
            temp[k++] = array[i++];
        }

        while (j <= end) {
            //右边剩余附上
            temp[k++] = array[j++];
        }

        for (int l = 0; l < k; l++) {
            array[start++] = temp[l];
        }
    }
}
