package org.example;

import java.util.ArrayList;

public class Stack1 {

    ArrayList<String> Stack = new ArrayList<>();



    //Stack에 데이터를 추가하는 메소드
    public void push(String ward){
        Stack.add(ward);
    }

    //Stack에 이번차례 추출되는 데이터를 확인하는 메소드
    public void peek(){
        System.out.println(Stack.get(Stack.size()-1));
    }

    //Stack에 이번차례 추출되는 데이터를 확인하는 메소드
    public String pop(){
        String popData = Stack.get(Stack.size()-1);
        //System.out.println(popData);
        Stack.remove(popData);

        return popData;
    }

    //Stack이 비어있는지 확인하는 메소드
    public void empty(){

        if (Stack.size() == 0){
            System.out.println("Data is empty.");

        }else{
            System.out.println("Data is exist.");
        }

    }


}
