package com.tranbaquan.specialjava.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFinder {
    public int findByPattern(String content, String pattern) {
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(content);
        if(m.find()) {
            return m.start();
        }
        return -1;
    }

    public static void main(String[] args) {
        String content = "Xin chao cac ban      cau 19:  hay 1 cho toi biet...";
        String pattern = "\\s*cau\\s*[0-9][0-9]\\s*:";
        StringFinder stringFinder = new StringFinder();
        System.out.println(stringFinder.findByPattern(content, pattern));
    }
}
