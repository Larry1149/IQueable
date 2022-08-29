import java.util.List;

public class IQueable {
    public List<String> queueList;

    public IQueable(){}

    //add value
    public List<String> enqueue(String value){
        queueList.add(value);
        return queueList;
    }

    //remove item
    public String dequeue(){
        int index = 0;
        return queueList.remove(index);
    }

    //get all queueList
    public List<String> getQueue(){
        return queueList;
    }

    //return size
    public int size(){
        return queueList.size();
    }

}
