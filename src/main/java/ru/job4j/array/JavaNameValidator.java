package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()
                || Character.isUpperCase(name.charAt(0))
                || Character.isDigit(name.charAt(0))) {
            return false;
        }
        char[] symbols = name.toCharArray();
        for (int i = 1; i < symbols.length; i++) {
            int code = Character.codePointAt(symbols, i);
            if (!isSymbolValid(code)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSymbolValid(int code) {
        return isSpecialSymbol(code) || isUpperLatinLetter(code)
                || isLowerLatinLetter(code) || Character.isDigit(code);
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 95 || code == 36;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}