package general.telecom;

public class Polindrome {

    public static boolean isPolindrome2(String str) {
        String normalizedStr = normalizeString(str);

        int startIdx = 0;
        int endIdx = normalizedStr.length() - 1;

        while (startIdx < endIdx) {
            if (normalizedStr.charAt(startIdx) != normalizedStr.charAt(endIdx)) {
                return false;
            }

            ++startIdx;
            --endIdx;
        }

        return true;
    }

    public static boolean isPolindrome(String str) {
        String normalizedStr = normalizeString(str);
        String reversedStr = new StringBuilder(normalizedStr).reverse().toString();

        return normalizedStr.equals(reversedStr);
    }

    private static String normalizeString(String str) {
        return str
                .toLowerCase()
                .replaceAll("\\s", "")
                .replaceAll("[.,?]+", "");
    }
}
