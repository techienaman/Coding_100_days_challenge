package StacksQuestions;
import java.util.Stack;

public class ValidParenthesisCode {
    public static void main(String[] args) {
        String str = "{(})}";
        System.out.println(isParenthesisBalanced(str));
    }

    public static boolean matches(char poppedCharacter,char ch){
        if((poppedCharacter=='(' && ch==')') ||
           (poppedCharacter=='{' && ch=='}') ||
           (poppedCharacter=='[' && ch==']') )
        {
            return true;
        }
        return false;
    }

    public static boolean isParenthesisBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(str.charAt(i));
            }

            else {
                char poppedCharacter = st.pop();
                if(!matches(poppedCharacter,ch)){
                    return false;
                }
            }
        }
       if(st.empty()){
           return true;
       }
       else{
           return false;
       }
    }
}

