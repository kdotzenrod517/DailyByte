package math;

public class Tresbonacci {

    public static void main(String[] args) {
        System.out.println(tresbonacci(3)); // return 2 (1 + 1 + 2 = 3).
        System.out.println(tresbonacci(6)); // 13
    }

    // Runtime: O(N).
    // Space complexity: O(1) or constant.
    public static int tresbonacci(int N){
        if(N < 2) return N;

        int first = 0;
        int second = 1;
        int third = 1;
        for(int i = 3; i <=N; i++){
            int next = first + second + third;
            first = second;
            second = third;
            third = next;
        }

        return third;
    }
}
