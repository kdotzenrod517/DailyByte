package math;

public class SpreadsheetProblem {

    public static void main(String[] args){
        System.out.println(columnTitle(1)); // A
        System.out.println(columnTitle(2)); // B
        System.out.println(columnTitle(3)); // C
        System.out.println(columnTitle(26)); // Z
        System.out.println(columnTitle(27)); // AA
        System.out.println(columnTitle(28)); // BB
    }

    // Runtime: O(N).
    // Space complexity: O(N)
    public static String columnTitle(int n){
        StringBuilder title = new StringBuilder();
        while(n > 0) {
            title.insert(0, (char)(((n - 1) % 26) + 'A'));
            n = (n - 1) / 26;
        }

        return title.toString();
    }
}
