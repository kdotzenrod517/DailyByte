package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class CallCounter {

    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        ping(1); // return 1 (1 call within the last 3 seconds)
        ping(300); // return 2 (2 calls within the last 3 seconds)
        ping(3000); // return 3 (3 calls within the last 3 seconds)
        ping(3002); // return 3 (3 calls within the last 3 seconds)
        ping(7000); //return 1 (1 call within the last 3 seconds)
    }

    public static int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.remove();
        }

        return queue.size();
    }
}
