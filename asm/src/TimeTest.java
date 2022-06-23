public class TimeTest {
    public static void main(String[] args){
        Queue q = new Queue(10);
        Stack s = new Stack(10);
        String message = "hello";
        
        
        long startTime = System.currentTimeMillis();
        for (int i =0; i<10000; i++){
        q.enQueue(message);

        while(!q.isEmpty()){
            message = q.deQueue();
            s.push(message);
        }

        System.out.println("Here is your message:");
        System.out.print("[");
        while(!s.isEmpty()){
            message = s.pop();
            System.out.print(message);
        }
        System.out.println("]");}
    

        long endTime = System.currentTimeMillis();
        double time = (endTime - startTime)/10000.0;
        System.out.println("Runtime in seconds:"+time);





    }


    
}
