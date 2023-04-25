package com.wall.base.sort;

/**
 * 快速排序
 * 划分出小区间进行作业划分
 *
 * @author Wall
 * @date 2023/3/17
 * @version: 1.0
 */
public class QuickSort implements Sort {
    @Override
    public int[] accept(int[] array) {
        return quickSort(array, 0, array.length - 1);
    }

    private int[] quickSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = partition(array, left, right);
            //左边快排
            array = quickSort(array, left, mid - 1);
            //右边快排
            array = quickSort(array, mid + 1, right);
        }

        return array;
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[left];
        int i = left + 1;
        int j = right;
        while (true) {
            //向右移动找到第一个大于pivot的值位置
            while (i <= j && array[i] < pivot) {
                i++;
            }
            //向左移动找到第一个小于pivot值的位置
            while (j >= i && array[j] > pivot) {
                j--;
            }
            if (i >= j) {
                break;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        array[left] = array[j];
        array[j] = pivot;
        return j;
    }
}
