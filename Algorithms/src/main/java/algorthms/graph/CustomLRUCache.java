package algorthms.graph;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CustomLRUCache {

    private static final int  CACHE_LIMIT = 4;
    // create static map
    private static Map<Integer, MyCache> cache = new HashMap<>();

    // take variable of DeQueue type and Linked List
        Deque<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        
    }

    // on Putting objects to the List just veify if it reaches to the max limit
        // if yes then get the value from DeQueue and remove the same
        // Else insert the same
    public void put(Integer key, Object val){
        if(cache.containsKey(key)){
            MyCache myCache = (MyCache) cache.get(key);
            queue.remove(myCache.key);
        }else{
            if(cache.size() == CACHE_LIMIT){
               Integer lastRemoved =  queue.removeLast();
               cache.remove(lastRemoved);
               cache.put(key, new MyCache(key, val));
               queue.addFirst(key);

            }
        }
    }

    // Since logic is least recent then while getting data I need to main data in DeQueue
    public Object get(int key){
        if(cache.containsKey(key)){
            MyCache obj =  cache.get(key);
            queue.remove(obj.key);
            queue.addFirst(obj.key);
            return obj;
        }
        return "Not Found";
    }

    class MyCache{
        int key;
        Object obj;
        MyCache(int key, Object obj){
            this.key = key;
            this.obj = obj;
        }
    }

}
