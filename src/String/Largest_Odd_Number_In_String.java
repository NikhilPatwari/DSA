package String;

/*
 * You are given a string num, representing a large integer.
 * Return the largest-valued odd integer (as a string) that is a non-empty substring of num,
 * or an empty string "" if no odd integer exists.
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * Constraints:
 *   1 <= num.length <= 10^5
 *   num only consists of digits and does not contain any leading zeros.
 */
public class Largest_Odd_Number_In_String {
    public static void main(String[] args) {
        System.out.println(Long.valueOf("7542351161"));
        Largest_Odd_Number_In_String l = new Largest_Odd_Number_In_String();
        System.out.println(l.largestOddNumber("7542351161"));
    }

    // Brute force - finding all SubString O(n^2)
    public String largestOddNumber(String s) {
        String res = "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                String temp = s.substring(i, j + 1);
                if ((int) temp.charAt(j - i) % 2 == 1) {
                    res = compare(temp, res);
                }
            }
        }
        return res;
    }

    public String compare(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return s1;
        } else if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                char n = s1.charAt(i);
                char o = s2.charAt(i);
                if ((int) n > (int) o) {
                    return s1;
                } else if ((int) o > (int) n) {
                    return s2;
                }
            }
        }
        return s2;
    }

    // Optimal Greedy
    public String largestOddNumberOptimal(String s) {
        for(int i = s.length() -1; i >=0 ; i-- ) {
            if(((int)s.charAt(i)) %2 == 1) {
                return s.substring(0,i+1);
            }
        }
        return "";
    }
}
