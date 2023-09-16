package String;

public class Remove_Outer_Parenthesis {
    public static void main(String[] args) {
        Remove_Outer_Parenthesis r = new Remove_Outer_Parenthesis();
        System.out.println(r.removeOuterParentheses("(()())(())"));
    }
    public String removeOuterParentheses(String s) {
        int lp = 0;  // left parenthesis count
        int rp = 0; // right parenthesis count
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length();i++) {
            if(s.charAt(i) == ')'){
                rp++;
            }else{
                lp++;
            }
            if(lp > 1 && lp != rp){
                sb.append(s.charAt(i));
            }
            if(lp == rp){
                lp = 0;
                rp = 0;
            }
        }
        return sb.toString();
    }
}
