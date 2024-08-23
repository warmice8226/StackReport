package org.example

fun main() {

    var testStack : RStack = RStack()
    var popData : String = ""

    testStack.push("First data")
    popData = testStack.peek().toString()
    //여기서는 왜 toString() 메소드가 계속 붙어야 하는가?
    println(popData)

    testStack.push("Second data")
    testStack.push("Third data")
    testStack.push("Fourth data")

    println(testStack.pop())
    println(testStack.pop())
    println(testStack.pop())
    println(testStack.empty())
    println(testStack.pop())
    println(testStack.empty())









}