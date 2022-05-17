package StacksAndQueues;

public class MovingAverage {
    int[] stream;
    int size;
    int insert;
    int sum;

    public MovingAverage(int size) {
        stream = new int[size];
        size = 0;
        insert = 0;
        sum = 0;
    }

    public double next(int val) {
        if (size < stream.length) {
            size++;
        }

        sum -= stream[insert];
        sum += val;
        stream[insert++] = val;
        insert %= stream.length;

        return (double) sum / size;
    }
}
