package StacksQuestions;

import java.util.Stack;

public class RedundantBrackets  {
    public static void main(String[] args) {
        String str="(a+(b*c))";
        System.out.println(findRedundantBrackets(str));
    }
    public static boolean findRedundantBrackets(String str){
        Stack<Character> stack=new Stack<>();
        boolean isRedundant=true;
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' ||
               (ch=='(')
            )
            {
                stack.push(ch);
            }
            else{

                if(ch==')'){

                    while(stack.peek()!='(' ){
                        char operator=stack.pop();
                        if(operator=='*' || operator=='+' || operator=='-' || operator=='/'){
                            isRedundant=false;
                        }
                    }
                }
            }
        }
        stack.pop();
        if(isRedundant==true){
            return true;
        }
return false;
    }

}
