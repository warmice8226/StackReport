package DataStructures;

public class Main {

    public static void main(String[] args){
        RStack testStack = new RStack();
        String lookAtData = "";
        boolean empty;

        testStack.push("First Data");
        lookAtData = testStack.peek();
        System.out.println(lookAtData);

        testStack.push("Second Data");
        testStack.push("Third Data");
        lookAtData = testStack.pop();
        System.out.println(lookAtData);
        System.out.println();
        empty = testStack.empty();
        System.out.println(empty);

        lookAtData = testStack.peek();
        lookAtData = testStack.peek();
        System.out.println(lookAtData);
        System.out.println();
        empty = testStack.empty();
        System.out.println(empty);
    }



}
