package math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args){
        System.out.println(fizzBuzz(3)); // ["1","2","Fizz"]
        System.out.println(fizzBuzz(5)); // ["1","2","Fizz","4","Buzz"]
    }

    // Runtime: O(N) where N is the n we’re given.
    // Space complexity: O(N) where N is the n we’re given.
    public static List<String> fizzBuzz(int n){
        List<String> response = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                response.add("FizzBuzz");
            } else if (i % 3 == 0){
                response.add("Fizz");
            } else if (i % 5 == 0){
                response.add("Buzz");
            } else {
                response.add(String.valueOf(i));
            }
        }
        return response;
    }
}
