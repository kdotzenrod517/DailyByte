package strings;

import java.util.HashSet;
import java.util.Set;

public class Travelling {

    public static void main(String[] args) {
        System.out.println(wanderingTraveler("NE")); // false
        System.out.println(wanderingTraveler("NESW")); // true
    }

    // Runtime: O(N) where N is the total number of characters in path.
    // Space complexity: O(N) where N is the total number of characters in path.
    public static boolean wanderingTraveler(String path){
        Set<String> visited = new HashSet<>();
        int xPosition = 0;
        int yPosition = 0;
        visited.add(xPosition + "" + yPosition);

        for(char c : path.toCharArray()){
            if(c == 'N'){
                yPosition++;
            } else if (c == 'E'){
                xPosition++;
            } else if (c == 'S'){
                yPosition--;
            } else {
                xPosition--;
            }

            String updatedPosition = xPosition + "" + yPosition;
            if(visited.contains(updatedPosition)){
                return true;
            }
            visited.add(updatedPosition);
        }

        return false;
    }
}
