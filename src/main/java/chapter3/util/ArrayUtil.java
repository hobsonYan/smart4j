package chapter3.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author yan hongbo
 * @date 2021/2/3 15:55
 * @description 数组工具类
 */
public final class ArrayUtil {

    /**
     * 判断数组是否非空
     *
     * @param array
     * @return
     */
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtil.isEmpty(array);
    }

    /**
     * 判断数组是否为空
     *
     * @param array
     * @return
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
