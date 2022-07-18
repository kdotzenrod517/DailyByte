package BFS;

import java.util.*;

public class KillDescendants {

    // You are given two lists of integers and an integer representing a process id to kill.
    // One of the lists represents a list of process ids and the other represents a list of each of the processes’
    // corresponding (by index) parent ids. When a process is killed, all of its children should be reaped
    // (i.e. also killed). Return a list of all the process ids that are killed as a result of killing the requested process.
    public static void main(String[] args){
        // return [3, 7] as killing process 3 will also require killing its child (i.e. process 7).
        System.out.println(killDescendants(List.of(2, 4, 3, 7), List.of(0, 2, 2, 3), 3));
    }

    // Runtime: O(N) where N is the number of processes we’re given.
    // Space complexity: O(N) where N is the number of processes we’re given.
    public static List<Integer> killDescendants(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer, List<Integer>> parentToChildren = new HashMap<>();
        for (int i = 0; i < ppid.size(); i++) {
            parentToChildren.putIfAbsent(ppid.get(i), new ArrayList<>());
            parentToChildren.get(ppid.get(i)).add(pid.get(i));
        }

        List<Integer> killed = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(kill);
        while (!queue.isEmpty()) {
            int current = queue.remove();
            killed.add(current);
            if (parentToChildren.containsKey(current)) {
                queue.addAll(parentToChildren.get(current));
            }
        }

        return killed;
    }
}
