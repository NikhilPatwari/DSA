package String;

public class Reverse_Words_In_String {
    public static void main(String[] args) {
        Reverse_Words_In_String r = new Reverse_Words_In_String();
        System.out.println(r.reverseWordsOptimal("  hello world  "));
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

    // Most optimal approach

    public String reverseWordsOptimal(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        char c;
        for(int i = 0; i< s.length(); i++) {
            c = s.charAt(i);
            if(c != ' ') {
                temp.append(c);
            }else {
                if(!temp.isEmpty()) {
                    if(!res.isEmpty()) {
                        res.insert(0," ");
                    }
                    res.insert(0, temp);
                }
                temp.delete(0,temp.length());
            }
        }
        if(!temp.isEmpty()) {
            if(!res.isEmpty()) {
                res.insert(0," ");
            }
            res.insert(0, temp);
        }
        return res.toString();
    }
}
