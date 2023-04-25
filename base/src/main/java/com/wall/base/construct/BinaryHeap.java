package com.wall.base.construct;

/**
 * 最大二叉堆
 * <p>
 * 由数组存储的话，我们可以知道的是：
 * 序号为n的节点，它的左右节点序号为：2n+1、2n+2
 *
 * @author Wall
 * @date 2023/4/26
 * @version: 1.0
 */
public class BinaryHeap {
    private final int[] array;

    public BinaryHeap(int[] array) {
        this.array = build(array, array.length);
    }

    public int[] getArray() {
        return array;
    }

    public static int[] build(int[] array, int length) {
        //从最后一个非叶子节点开始下沉，即末位的父节点往上找
        for (int i = (length - 2) / 2; i >= 0; i--) {
            downAdjust(array, i, length);
        }
        return array;
    }

    /**
     * 上浮
     *
     * @param array  数组
     * @param length 二叉堆长度
     */
    public static void upAdjust(int[] array, int length) {
        int child = length - 1;
        int parent = (child - 1) / 2;
        int temp = array[child];

        while (child > 0 && temp < array[parent]) {
            //如果当前节点的父节点小于当前节点的，继续往上找
            array[child] = array[parent];
            child = parent;
            parent = (child - 1) / 2;
        }

        array[child] = temp;
    }

    /**
     * 下沉
     *
     * @param array  数组
     * @param parent 下称节点序号
     * @param length 二叉堆长度
     */
    public static void downAdjust(int[] array, int parent, int length) {
        int temp = array[parent];
        int child = 2 * parent + 1;

        while (child < length) {
            //如果右孩子节点比左孩子大，则定位到右孩子
            if (child + 1 < length && array[child] < array[child + 1]) {
                child++;
            }

            if (temp >= array[child]) {
                break;
            }

            array[parent] = array[child];
            parent = child;
            child = 2 * parent + 1;
        }
        array[parent] = temp;
    }
}
