package liuziyuan.net.framework.utils;

import java.util.Collection;
import java.util.Map;

/**
 * 字符串操作工具类
 * Created by lty on 2017/1/3.
 */
public class StringUtil {

    /**
     * 是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
    /**
     * 判断集合是否为空
     * @param c
     * @return
     */
    public static boolean isEmpty(Collection<?> c) {
        if (c != null&& c.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isNotEmpty(Collection<?> c) {
        return !isEmpty(c);
    }

    /**
     * 判断map集合是否为空
     * @param map
     * @return
     */
    public static boolean isEmpty(Map<?,?> map) {
        if (map != null&& map.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isNotEmpty(Map<?,?> map) {
        return !isEmpty(map);
    }

    /**
     * 去掉空格
     * @param str
     * @return
     */
    public static String getDisplayValue(String str){
        if(isNotEmpty(str)){
            return str.trim();
        }
        return "";
    }



}
