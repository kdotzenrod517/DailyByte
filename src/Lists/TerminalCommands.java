package Lists;

public class TerminalCommands {

    public static void main(String[] args) {
        System.out.println(terminalCommands(new String[]{"a/", "b/"})); // return 2 (we've gone two directories deeper, so we must go backwards two directories which requires 2 commands).
        System.out.println(terminalCommands(new String[]{"a/", "../"})); // 0
    }

    // Runtime: O(N) where N is the total number of elements in commands.
    // Space complexity: O(1) or constant.
    public static int terminalCommands(String[] commands) {
        int count = 0;
        for (String command: commands) {
            if (command.equals("../")) {
                count = Math.max(0, --count);
            } else if (command.equals("./")) {
                continue;
            } else {
                count++;
            }
        }

        return count;
    }
}
