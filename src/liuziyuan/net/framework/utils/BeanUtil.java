package liuziyuan.net.framework.utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lty on 2017/1/3.
 */
public class BeanUtil {
    /**
     * 把一个bean转换成map,hasNull为true则包括空值属性
     * @param object
     * @param hasNull
     * @return
     */
    public static Map<String,Object> converMap(Object object,boolean hasNull) throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        Class clazz = object.getClass();
        //获取所有字段
        Field[] fields = clazz.getDeclaredFields();
        for (Field field: fields) {
            field.setAccessible(true);
            if(hasNull){
                map.put(field.getName(), field.get(object));
            }else {
                if (field.get(object) != null) {
                    map.put(field.getName(), field.get(object));
                }
            }
        }
        return map;
    }
}
