package com.wall.base.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 桶排序
 *
 * @author Wall
 * @date 2023/4/26
 * @version: 1.0
 */
public class BucketSort implements Sort{
    @Override
    public int[] accept(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int max = array[0];
        int min = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }

        int range = max - min;
        //创建d/5+1个桶，第i桶存放5*i~5*i+5-1范围的数
        int bucketNum = range / 5 + 1;
        List<LinkedList<Integer>> bucketList = new ArrayList<>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketList.add(new LinkedList<>());
        }
        for (int j : array) {
            bucketList.get((j - min) / range).add(j - min);
        }

        for (int i = 0; i < bucketNum; i++) {
            Collections.sort(bucketList.get(i));
        }

        int k = 0;
        for (int i = 0; i < bucketNum; i++) {
            for (Integer t : bucketList.get(i)) {
                array[k++] = t + min;
            }
        }

        return array;
    }
}
