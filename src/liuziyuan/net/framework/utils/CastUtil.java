package liuziyuan.net.framework.utils;


/**
 * 数据类型转换工具
 * Created by lty on 2016/12/29.
 */
public class CastUtil {

    public static String castString(Object obj){
        return castString(obj,"");
    }

    /**
     * 如果obj为空，则给默认值
     * @param obj
     * @param defaultValue
     * @return
     */
    public static String castString(Object obj,String defaultValue){
        return obj != null ?String.valueOf(obj) : defaultValue;
    }

    public static double castDouble(Object obj){
        return castDouble(obj,0);
    }

    /**
     * 如果obj不能转换则去默认值
     * @param obj
     * @param defaultValue
     * @return
     */
    public static double castDouble(Object obj,double defaultValue){
        double value = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    value = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    public static long castLong(Object obj){
        return castLong(obj,0);
    }

    /**
     * 如果obj不能转换则去默认值
     * @param obj
     * @param defaultValue
     * @return
     */
    public static long castLong(Object obj,long defaultValue){
        long value = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    value = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    public static int castInt(Object obj){
        return castInt(obj,0);
    }

    /**
     * 如果obj不能转换则去默认值
     * @param obj
     * @param defaultValue
     * @return
     */
    public static int castInt(Object obj,int defaultValue){
        int value = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    value = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    public static boolean castBoolean(Object obj){
        return castBoolean(obj,false);
    }

    /**
     * 如果obj不能转换则去默认值
     * @param obj
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object obj,boolean defaultValue){
        boolean value = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    value = Boolean.parseBoolean(strValue);
                } catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }



}
