package String;

public class RemoveOuterParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        String result = removeOuterParenthesis(s);
        System.out.println(result);
    }

    /*
        T.C : O(N)
        S.C : O(1)
     */
    public static String removeOuterParenthesis(String s) {
        int cnt = 0;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                cnt--;
            }

            if (cnt != 0) {
                ans.append(s.charAt(i));
            }

            if (s.charAt(i) == '(') {
                cnt++;
            }
        }

        return ans.toString();
    }
}
