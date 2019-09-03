package leetcode;

import sun.plugin.javascript.navig.Link;

import java.util.*;

/**
 * @Author JEVEM624
 * @Date 2019/8/20
 * @Version 1.0
 */
public class LRUCache {
    public static void main(String[] args) {
        LRUCache cache=new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.get(1);
        cache.get(2);
        cache.get(3);
    }
    Map<Integer,Integer>map=new HashMap<>();
    Deque<Integer>deque=new LinkedList<>();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
    }

    public int get(int key) {
        int res=map.getOrDefault(key, -1);
        if (res!=-1){
            deque.remove(key);
            deque.addLast(key);
        }
        return res;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)){
            deque.remove(key);
            deque.addLast(key);
            map.put(key, value);
        }else {
            if (capacity==deque.size()){
                int rmKey=deque.pollFirst();
                map.remove(rmKey);
            }
            deque.addLast(key);
            map.put(key, value);
        }
    }
}

