import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        IQueable queue = new IQueable();
        queue.queueList = new ArrayList<>();

        IQueable queue1 = new IQueable();
        queue1.queueLink = new LinkedList<>();

        for(int i = 1 ; i <= 5 ;i++){
            System.out.println("add value "+i+" to queue = "+queue.enqueue(Integer.toString(i)));
            System.out.println("add value "+i+" to queue1 = "+queue1.add(Integer.toString(i)));
        }
        System.out.println("removed value : " + queue.dequeue());
        System.out.println("items in the queue : " + queue.getQueue());
        System.out.println("size of queue : " + queue.size());

        for(int i = 1 ; i <= 5 ;i++){
            System.out.println("First Out : " + queue1.removeFrist());
            System.out.println( queue1.getQueueLink());
        }

    }

}
