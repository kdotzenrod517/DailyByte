package GreedyAlgos;

public class CreateStaircase {

    // Given a value, N, you are asked to form a staircase.
    // The number of elements in each row of the staircase must match the current row.
    // Return the total number of full staircase rows you can create.
    public static void main(String[] args) {
        // *
        // * * (this staircase has two rows)
        System.out.println(createStaircase(3));
        // *
        // * *
        // * * *
        // * (this row is not full and has 3 rows)
        System.out.println(createStaircase(7));
    }


    // Runtime: O(N).
    // Space complexity: O(1) or constant.
    public static int createStaircase(int N) {
        int rows = 0;
        while(N > 0){
            rows += 1;
            N -= rows;
        }
       return N == 0 ? rows : rows - 1;
    }
}
