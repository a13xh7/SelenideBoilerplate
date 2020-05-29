package helpers;


import java.util.regex.Pattern;

public class Trim {

    public static String trim(String string, String trimSymbol) {
        trimSymbol = Pattern.quote(trimSymbol);
        String trimmed = ltrim(string, trimSymbol);
        return rtrim(trimmed, trimSymbol);
    }

    public static String ltrim(String string, String trimSymbol) {
        trimSymbol = Pattern.quote(trimSymbol);
        return string.replaceAll("^" + trimSymbol + "+", "");
    }

    public static String rtrim(String string, String trimSymbol) {
        trimSymbol = Pattern.quote(trimSymbol);
        return string.replaceAll(trimSymbol + "+$", "");
    }
}
