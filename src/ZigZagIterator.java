import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Akash on 2/18/2017.
 */
public class ZigZagIterator {

    LinkedList<Iterator> list;

    public ZigZagIterator(List<Integer> v1, List<Integer> v2){
       list = new LinkedList<Iterator>();
       if(!v1.isEmpty()) list.add(v1.iterator());
       if(!v2.isEmpty()) list.add(v2.iterator());
    }

    public int next(){
        Iterator poll = list.remove();
        int result = (Integer)poll.next();
        if(poll.hasNext()) list.add(poll);
        return result;
    }

    public boolean hasNext(){
        return !list.isEmpty();
    }

    public static void main(String[] args){
        List<Integer> v11 = new ArrayList<Integer>();
        v11.add(1); v11.add(2);
        List<Integer> v22 = new ArrayList<Integer>();
        v22.add(3);v22.add(4);v22.add(5);v22.add(6);
        ZigZagIterator i = new ZigZagIterator(v11, v22);
    }
}
