public class MyStack {     
    public String messageContent[];
    public int size;
    public MyStack(int size) {
        this.messageContent = new String[size]; 
    }
    //check if the stack empty or not
    public boolean isEmpty(){
        return (size==0);
    }
    //check if the stack full or not 
    public boolean isFull(){
        return (size==messageContent.length);
    }
    //insert message at the top of stack 
    public void push (String items) {
        //check stackoverflow
        try{
        if (isFull());
        }catch (Exception e){
            System.out.println("Stack is full");
        }
        this.messageContent[size++]=items;
    }
    //remove the top message
    public String pop()  {
        String popMess ="";
        try{
        if (isEmpty());
        } catch (Exception e){
            System.out.println("Stack is empty");
        }
        popMess = this.messageContent[size-1];
        size--;
        return popMess;
    }
}

