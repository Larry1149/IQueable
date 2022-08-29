import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        IQueable queue = new IQueable();
        queue.queueList = new ArrayList<>();

        for(int i = 1 ; i <= 5 ;i++){
            System.out.println("add value : "+queue.enqueue(Integer.toString(i)));

        }
        System.out.println("removed value : " + queue.dequeue());
        System.out.println("items in the queue : " + queue.getQueue());
        System.out.println("size of queue" + queue.size());

    }

}
