package DataStructures;

public class RStack {
    private String[] stackList;
    private int length;

    //추가
    public void push(String data){
        if(this.length == 0){
            this.stackList = new String[1];
            this.stackList[0] = data;

        }else{
            String[] newStackList = new String[length+1];

            for(int i =0; i<length; i++){
                newStackList[i] = this.stackList[i];
            }
            newStackList[length] = data;

            this.stackList = new String[length+1];
            this.stackList = newStackList;

        }
        this.length++;


    }
    //제거 겸 뽑기
    public String peek(){
        String popData = stackList[length-1];

        String[] newStackList = new String[length-1];

        for (int i = 0; i < length-1;i++){
            newStackList[i] = stackList[i];
        }

        stackList = new String[length-1];
        stackList = newStackList;

        this.length--;

        return popData;
    }


    //획득(조회)
    public String pop(){
        return stackList[length-1];
    }

    //비어있는지 확인
    public boolean empty(){
        if (length == 0){
            return false;
        }else{
            return true;
        }

    }

}
