package Lists;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Flights {

    public static void main(String[] args) {
        System.out.println(vacationDestinations(List.of(List.of("A", "B"), List.of("B", "C")))); // C
        System.out.println(vacationDestinations(List.of(List.of("A", "B"), List.of("C", "D"), List.of("B", "C")))); // D
    }

    // Runtime: O(N) where N is the total number of elements in flights.
    // Space complexity: O(N) where N is the total number of elements in flights.
    public static String vacationDestinations(List<List<String>> flights){
        Set<String> cities = new HashSet<>();
        for(List<String> flight : flights){
            cities.add(flight.get(1));
        }
        for(List<String> flight : flights){
            cities.remove(flight.get(0));
        }
        return cities.iterator().next();
    }
}
