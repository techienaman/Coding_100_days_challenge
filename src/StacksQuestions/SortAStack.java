package StacksQuestions;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(9);
        stack.push(2);
        stack.push(4);
        System.out.println(stack);
        emptyStack(stack);
        System.out.println(stack);


    }

    public static void sortStack(Stack<Integer> st,int  element){
        if(st.empty()  || (!st.empty() && st.peek()<element)){
            st.push(element);
            return;
        }
        int poppedElement=st.pop();
        sortStack(st,element);
        st.push(poppedElement);
    }


    public static void emptyStack(Stack<Integer> st){
        if(st.empty()){
            return;
        }
        int poppedElement=st.pop();
        emptyStack(st);
        sortStack(st,poppedElement);
    }
}
