package org.example

fun main() {
    var testStack = KtStack()
    var testWard : String

    testStack.push("First Test Ward")
    testWard = testStack.pop()
    testWard = testStack.peek()
    testStack.empty()


    testStack.push("Second Test Ward")
    testStack.empty()
}