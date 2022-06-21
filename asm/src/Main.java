import java.util.Random;

public class Main {
     
    public static void main(String[] args) throws Exception {

        MyQueue queue = new MyQueue(10);
        MyStack stack = new MyStack(10);
        System.out.println("Your message:");
        Random rand = new Random();

        //time
        long startTime = System.currentTimeMillis();
       

        //send
        for(long i =0; i<=1000;i++)
        {
        boolean flag = true;      
        while (flag) {
            int r = rand.nextInt(20);
            if (r<10){
                if (!queue.isFull()){
                    String s ="hello"+r;
                    queue.enQueue(s);        
                }
            }
            
            else if (r<11){
                if(!queue.isEmpty() && !stack.isFull()) {
                    String s = queue.deQueue();
                    stack.push(s);
                }
            }
            else flag = false;


        }


        //receive
        

        System.out.println("Here is your message:");
        System.out.print("[ ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("]");}
    
        
        long endTime = System.currentTimeMillis();
        double time = (endTime - startTime)/1000.0;
        System.out.println("Runtime in seconds:"+time);

    }

}