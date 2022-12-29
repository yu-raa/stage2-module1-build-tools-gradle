package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String str : args)
            try {
                double doub = Double.parseDouble(str);
                if (doub <= 0) {
                    return false;
                }
            }
            catch (NumberFormatException | NullPointerException e) {
                return false;
            }

        return true;
    }
}