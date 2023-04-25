package com.wall.base.sort;

/**
 * 排序工具
 *
 * @author Wall
 * @date 2023/3/17
 * @version: 1.0
 */
public interface Sort {

    /**
     * 排序处理
     *
     * 将传入的数组进行排序，返回有序数据
     *
     * @param array 数组
     * @return 有序数组
     */
    int[] accept(int[] array);
}
