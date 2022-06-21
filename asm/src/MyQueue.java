
public class MyQueue {

    protected String messageContent[];
    protected int size;
    //constructor
    public MyQueue(int size)
    {
        this.messageContent = new String[size];
    }
    //check if queue is empty
    public boolean isEmpty(){
        return size==0;
    }
    //check if queue is full
    public boolean isFull(){
        return (size==messageContent.length);
    }

    //insert message to Queue
    public void enQueue(String item){
        messageContent[size++]=item;
        
    }
    //remove front message
    public String deQueue(){
        String tmp= messageContent[0];
        for (int i = 1; i < size-1; i++) {
            messageContent[i] = messageContent[i+1];
        }
        size--;
        return tmp;

    }


        

    

}