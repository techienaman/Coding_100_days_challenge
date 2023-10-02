package StacksQuestions;

import java.util.Stack;

public class InsertElementAtBottomOfStack {
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(9);
        stack.push(2);
        stack.push(4);
        int size=stack.size();
     insertElementAtBottomOfStack(stack,size,100);
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

}
