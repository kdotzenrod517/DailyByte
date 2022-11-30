package strings;

public class Attendance {

    public static void main(String[] args){
        System.out.println(attendance("PLPAPPPA")); // false
        System.out.println(attendance("PLPLPLPALP")); // true
    }

    // Runtime: O(N) where N is the total number of characters in attendance.
    // Space complexity: O(1) or constant.
    public static boolean attendance(String attendance){
        int absences = 0;
        for(char c : attendance.toCharArray()){
            if(c == 'A'){
                absences++;
            }
        }

        return absences < 2 && !attendance.contains("LLL");
    }
}
