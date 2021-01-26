package chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author yan hongbo
 * @date 2021/1/26 15:50
 * @description 字符串工具类
 */
public final class StringUtil {

    /**
     * 判断字符串是否为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
