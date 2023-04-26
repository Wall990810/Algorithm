package com.wall.base.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 基数排序
 *
 * @author Wall
 * @date 2023/4/26
 * @version: 1.0
 */
public class RadioSort implements Sort {
    @Override
    public int[] accept(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        // 计算最大值是几位数
        int num = 1;
        while (max / 10 > 0) {
            num++;
            max = max / 10;
        }

        List<LinkedList<Integer>> bucketList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            bucketList.add(new LinkedList<>());
        }

        for (int i = 1; i <= num; i++) {
            for (int value : array) {
                int radio = (value / (int) Math.pow(10, i - 1)) % 10;
                bucketList.get(radio).add(value);
            }

            int k = 0;
            for (int j = 0; j < 10; j++) {
                for (Integer l : bucketList.get(j)) {
                    array[k++] = l;
                }

                bucketList.get(j).clear();
            }
        }

        return array;
    }
}
