package StacksQuestions;

import java.util.Stack;

public class ReverseStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(9);
        stack.push(2);
        stack.push(4);
        int size= stack.size();
        System.out.println(stack);
        reverseStackUsingRecursion(stack,size);
        System.out.println(stack);
    }


    public static void insertElementAtBottomOfStack(Stack st,int size,int elementToBePushed){
        if(st.empty()){
            st.push(elementToBePushed);
            return;
        }
        int elementPopped= (int) st.pop();
        insertElementAtBottomOfStack(st,size,elementToBePushed);
        st.push(elementPopped);
    }


    public static void reverseStackUsingRecursion(Stack st,int size){
        if(st.empty()){
            return ;
        }
        int elementToBePushed= (int) st.pop();
        reverseStackUsingRecursion(st,size);
        insertElementAtBottomOfStack(st,size,elementToBePushed);
    }
}
