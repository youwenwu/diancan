package com.demo.diancan.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public static final char UNDERLINE = '_';

    public StringUtil() {
    }

    public static String camelToUnderline(String param) {
        if (param != null && !"".equals(param.trim())) {
            int len = param.length();
            StringBuilder sb = new StringBuilder(len);

            for(int i = 0; i < len; ++i) {
                char c = param.charAt(i);
                if (Character.isUpperCase(c)) {
                    sb.append('_');
                    sb.append(Character.toLowerCase(c));
                } else {
                    sb.append(c);
                }
            }

            return sb.toString();
        } else {
            return "";
        }
    }

    public static String underlineToCamel(String param) {
        if (param != null && !"".equals(param.trim())) {
            int len = param.length();
            StringBuilder sb = new StringBuilder(len);

            for(int i = 0; i < len; ++i) {
                char c = param.charAt(i);
                if (c == '_') {
                    ++i;
                    if (i < len) {
                        sb.append(Character.toUpperCase(param.charAt(i)));
                    }
                } else {
                    sb.append(c);
                }
            }

            return sb.toString();
        } else {
            return "";
        }
    }

    public static String underlineToCamel2(String param) {
        if (param != null && !"".equals(param.trim())) {
            StringBuilder sb = new StringBuilder(param);
            Matcher mc = Pattern.compile("_").matcher(param);
            int var3 = 0;

            while(mc.find()) {
                int position = mc.end() - var3++;
                sb.replace(position - 1, position + 1, sb.substring(position, position + 1).toUpperCase());
            }

            return sb.toString();
        } else {
            return "";
        }
    }
}
