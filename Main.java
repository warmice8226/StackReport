package org.example;

public class Main {
    public static void main(String[] args) {
        //empty : 해당 개체가 비어 있는지 확인
        //peek : 다음 대상에 대해서 확인
        //pop : 1개 대상 추출 및 제거
        //push : 1개 대상 추가
        String popData;

        Stack1 stack = new Stack1();

        stack.push("new data");

        stack.peek();
        popData= stack.pop();
        System.out.println(popData);

        stack.empty();

        stack.push("second test");
        stack.empty();

    }
}
