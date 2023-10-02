package StacksQuestions;

import java.util.Stack;

public class DeleteMiddleFromStack {

    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(9);
        stack.push(2);
        System.out.println(stack);
        int size=stack.size();
        deleteMiddleFromStack(stack,size,0);
        System.out.println(stack);


    }

    public static void deleteMiddleFromStack(Stack stack,int size,int count){
        if(count==size/2){
            stack.pop();
            return ;
        }
        int poppedElement= (int) stack.pop();
        deleteMiddleFromStack(stack,size,count+1);
        stack.push(poppedElement);


    }
}
