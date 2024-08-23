package org.example

class RStack {
    private lateinit var stackArray: Array<String?>
    private var length : Int = 0

    public fun push(data : String){
        if (length == 0){
            this.stackArray = arrayOf(data)

        }else{
            val newStackArray = this.stackArray.copyOf(length+1)
            newStackArray[length] = data

            this.stackArray = Array(length+1){""} //공백은 null 취급 되는가?
            newStackArray.copyInto(this.stackArray,0,0,length+1)
            //endIndex인데 옮길 갯수를 써야하는 의문
        }

        length++
    }

    public fun pop(): String{
        var popData : String? = this.stackArray[length-1].toString()
        var newStackArray =  this.stackArray.copyOf(length-1)

        stackArray = Array(length-1){""}
        newStackArray.copyInto(this.stackArray,0,0,length-1)

        length--

        return popData!!
        //null값을 반환할 수는 없으니 !! 붙이는건 알겠다.
    }

    public fun peek(): String?{
        return stackArray[length-1]
    }


    public fun empty(): String{
        if(length == 0){
            return "No data"
        }else{
            return "Has data"
        }

    }






}

