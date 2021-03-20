package general.search;

public class FindSubstring {
    public static void main(String[] args) {

        System.out.println(findSubstringIndex("cat", "cat"));
        System.out.println(findSubstringIndex("can a cat eat grass?", "cat"));
    }

    public static int findSubstringIndex(String input, String substring) {
        int result = -1;

        for (int i = 0; i < input.length(); ++i) {
            for (int j = 0; j < substring.length(); ++j) {

                // TODO: assert index, to avoid index out of bounds exception
                if (input.charAt(i + j) != substring.charAt(j)) {
                    break;
                }

                if (j == substring.length() - 1) {
                    return i;
                }
            }
        }

        return result;
    }
}
