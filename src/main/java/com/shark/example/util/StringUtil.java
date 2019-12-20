package com.shark.example.util;

public class StringUtil {

    public static boolean isEmpty(String parameter) {
        return parameter == null || (parameter.trim().length() == 0);
    }

    public static String camelToUnderline(String parameter) {
        String underline = "_";
        if (StringUtil.isEmpty(parameter)) {
            return "";
        }
        int length = parameter.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = parameter.charAt(i);
            if (Character.isUpperCase(c)) {
                stringBuilder.append(underline);
                stringBuilder.append(Character.toLowerCase(c));
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
