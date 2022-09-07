package DFS;

import java.util.List;
import java.util.Stack;

public class LockedRooms {

    public static void main(String[] args){
        System.out.println(checkIfAllRoomsUnlock(List.of(List.of(1), List.of(2), List.of()))); // true
        System.out.println(checkIfAllRoomsUnlock(List.of(List.of(1, 2), List.of(2), List.of(0), List.of()))); // false
    }

    // Runtime: O(N + E) where N is the number of rooms and E is the number of keys.
    // This results from us iterating through both of them entirely.
    // Space complexity: O(N) which is the space used to store stack and visited rooms.
    public static boolean checkIfAllRoomsUnlock(List<List<Integer>> rooms) {

        boolean[] isVisited = new boolean[rooms.size()];
        isVisited[0] = true;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while(!stack.isEmpty()){
            int room = stack.pop();
            for(int key : rooms.get(room)){
                if(!isVisited[key]){
                    isVisited[key] = true;
                    stack.push(key);
                }
            }
        }

        for(boolean visited : isVisited){
            if(!visited) return false;
        }

        return true;
    }
}
