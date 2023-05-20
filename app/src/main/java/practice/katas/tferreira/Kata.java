package practice.katas.tferreira;

/**
 * Complete the solution so that it reverses the string passed into it.
 */
public class Kata {

    public static String solution(String str) {
        String result = new String();
        for (int i = str.length() - 1; i >= 0; i--) {
            result += (str.charAt(i));
        }
        return result;
    }

}
