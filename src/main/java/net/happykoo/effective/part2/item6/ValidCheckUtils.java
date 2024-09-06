package net.happykoo.effective.part2.item6;

import java.util.regex.Pattern;

public class ValidCheckUtils {
//    private static final Pattern PHONE_PATTERN = Pattern.compile("^01[0|1|6|7|8|9]-?\\d{3,4}-?\\d{4}$");
    public static boolean isPhoneFormat(String s) {
//        return PHONE_PATTERN.matcher(s).matches();
        return s.matches("^01[0|1|6|7|8|9]-?\\d{3,4}-?\\d{4}$");
    }
}
