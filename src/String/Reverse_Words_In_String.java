package String;

public class Reverse_Words_In_String {
    public static void main(String[] args) {
        Reverse_Words_In_String r = new Reverse_Words_In_String();
        System.out.println(r.reverseWords("  hello world  "));
    }

    public String reverseWords(String s) {
        String newS = s.trim();
        StringBuilder sb = new StringBuilder();
        String[] splitArr = newS.split(" ");
        for (int i = splitArr.length - 1; i >= 0; i--) {
            String temp = splitArr[i];
            if (!temp.equals(" ") && !temp.isEmpty()) {
                sb.append(temp);
                if (i > 0) {
                    sb.append(' ');
                }
            }
        }
        return sb.toString();
    }
}
