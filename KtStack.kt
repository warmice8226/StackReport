package org.example

import java.util.*

class KtStack {
    var stack = ArrayList<String>()
    var stackLength = 0;

    fun push(ward: String) {
        stack.add(ward)
        stackLength++
    }

    fun pop() : String  {
        println("현재 출력되는 데이터는 " + stack[stackLength-1] + "입니다.")
        return stack.get(stackLength - 1)
    }

    fun peek(): String {

        var ward = stack.get(this.stackLength-1)
        println("현재 출력되는 데이터는 " + ward + "입니다.")
        stack.remove(ward)
        stackLength--

        return ward
    }

    fun empty(): Boolean {
        if (stackLength == 0) {
            println("stack is empty")
            return true
        }else {
            println("stack is exist")
            return false
        }


    }

}