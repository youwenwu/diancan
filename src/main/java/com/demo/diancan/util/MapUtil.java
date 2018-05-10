package com.demo.diancan.util;

import java.util.Map;

public class MapUtil {
    public static String getString(Map map, String key){
        return map.get(key) == null ? null : map.get(key).toString();
    }

    public static Integer getInteger(Map map, String key){

        return map.get(key) == null ? null : Integer.parseInt(map.get(key).toString());
    }
}
