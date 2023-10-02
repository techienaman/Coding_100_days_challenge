package StacksQuestions;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args){
        String str="evol";
        System.out.println("The reverse of String " +str+ " is-->"+ reverseStringUsingStack(str));

    }

    public static String reverseStringUsingStack(String str){
        Stack<Character> st=new Stack<>();
        String reversedString="";
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        while(!st.empty()){
            reversedString=reversedString+st.pop();
        }
        return reversedString;


    }
}
