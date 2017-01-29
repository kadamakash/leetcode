import java.util.Hashtable;

/**
 * Created by Akash on 1/29/2017.
 */
public class LRUCache {

    class DLNode{
        int key;
        int value;
        DLNode pre;
        DLNode post;
    }

    private void removeNode(DLNode node){
        DLNode pre = node.pre;
        DLNode post = node.post;

        pre.post = post;
        post.pre = pre;
    }

    private void addNode(DLNode node){
        node.pre = head;
        node.post = head.post;

        head.post.pre = node;
        head.post = node;
    }

    private void moveToHead(DLNode node){

        this.removeNode(node);
        this.addNode(node);

    }

    private DLNode popTail(){
        DLNode t = tail.pre;
        this.removeNode(t);
        return t;
    }

    private Hashtable<Integer, DLNode> cache = new Hashtable<>();
    private int count, capacity;
    private DLNode head, tail;


    public LRUCache(int capacity){
        this.count = 0;
        this.capacity = capacity;

        head = new DLNode();
        head.pre = null;

        tail = new DLNode();
        tail.post = null;

        head.post = tail;
        tail.pre = head;
    }

    public int get(int key){
        DLNode node = cache.get(key);
        if(node == null){
            return -1;
        }

        this.moveToHead(node);

        return node.value;
    }

    public void put(int key, int value){
        DLNode node = cache.get(key);

        if(node == null){
            DLNode newNode = new DLNode();
            newNode.key = key;
            newNode.value = value;

            this.cache.put(key, newNode);
            this.addNode(newNode);

            ++count;

            if(count > capacity){
                DLNode tail = this.popTail();
                this.cache.remove(tail.key);
                --count;
            }
        } else {
            node.value = value;
            this.moveToHead(node);
        }
    }

    public  static void main(String[] args){
        LRUCache obj = new LRUCache(2);

        obj.put(1,1);
        obj.put(2,2);
        obj.put(1,2);
        System.out.print(obj.get(1));

    }
}
