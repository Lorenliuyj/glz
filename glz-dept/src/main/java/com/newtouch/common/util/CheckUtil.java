package com.newtouch.common.util;

import java.util.Collection;
import java.util.Map;

public class CheckUtil {

    public static boolean isEmpty(Object obj) {
        if(obj == null || obj.toString().isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(Object[] obj) {
        if(obj == null || obj.length == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(Collection collection) {
        if(collection == null || collection.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(int[] input) {
        if(input == null || input.length == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(Map map) {
        if(map == null || map.size() == 0) {
            return true;
        }
        return false;
    }

}
