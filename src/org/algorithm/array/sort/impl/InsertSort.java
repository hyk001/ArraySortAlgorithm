package org.algorithm.array.sort.impl;

import org.algorithm.array.sort.interf.Sortable;

/**
 * <p>
 * 插入排序算法
 * </p>
 * 2016年1月20日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class InsertSort implements Sortable {

    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            return null;
        }
        
        sortCore(array);
        
        return array;
    }

    /*
     * 排序算法的核心模块
     * 
     * @param array
     *      待排序数组
     */
    private void sortCore(int[] array) {
        int arraySize = array.length;
        
        for (int i = 1; i < arraySize; i++) {
            int j = i;
            
            int waitInsert = array[i];
            while(j > 0 && waitInsert < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            
            array[j] = waitInsert;
        }
    }
}
