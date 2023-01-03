package math;

public class NthFibonacci {

    public static void main(String[] args) {
        System.out.println(fib(2)); // 1
        System.out.println(fib(3)); // 2
    }

    // Runtime: O(N).
    // Space complexity: O(1) or constant.
    public static int fib(int N){
        if(N == 0 || N == 1) return N;

        int fibN = 0;
        int last = 0;
        int prev = 1;

        for(int i = 2; i <= N; i++){
            fibN = prev +last;
            last = prev;
            prev = fibN;
        }

        return fibN;
    }
}
