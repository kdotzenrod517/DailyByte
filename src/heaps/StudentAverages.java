package heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class StudentAverages {

    // Runtime: O(N * MlogM) where N is the total number of elements in grades and M is the total number of grades any single student can have.
    // Space complexity: O(N) where N is the total number of elements in grades.
    public static int[][] studentAverages(int[][] grades) {
        Map<Integer, PriorityQueue<Integer>> studentGrades = new HashMap();
        for (int[] grade: grades) {
            int student = grade[0];
            int score = grade[1];
            if (studentGrades.containsKey(student)) {
                PriorityQueue<Integer> scores = studentGrades.get(student);
                scores.add(score);
                if (scores.size() > 5) {
                    scores.poll();
                }
                studentGrades.put(student, scores);

            } else {
                PriorityQueue<Integer> scores = new PriorityQueue<Integer>(5);
                scores.add(score);
                studentGrades.put(student, scores);
            }
        }

        int index = 0;
        int[][] averages = new int[studentGrades.size()][2];
        for (int student: studentGrades.keySet()) {
            averages[index][0] = student;
            PriorityQueue<Integer> scores = studentGrades.get(student);
            int sum = 0;
            while (!scores.isEmpty()) {
                sum += scores.remove();
            }

            averages[index][1] = sum / 5;
            index++;
        }

        return averages;
    }
}
