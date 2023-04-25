package com.wall.base.sort;

import com.wall.base.construct.BinaryHeap;

/**
 * 堆排序
 *
 * 借助二叉堆逻辑，进行节点的下沉
 *
 * @author Wall
 * @date 2023/4/26
 * @version: 1.0
 */
public class HeapSort implements Sort {

    @Override
    public int[] accept(int[] array) {
        BinaryHeap heap = new BinaryHeap(array);
        array = heap.getArray();
        for (int i = array.length - 1; i >= 1; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            BinaryHeap.downAdjust(array,0, i);
        }

        return array;
    }
}
