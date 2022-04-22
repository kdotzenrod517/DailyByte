public class VacuumCleanerRoute {

    public static void main(String[] args){
        System.out.println(vacuumRoute("LR"));
        System.out.println(vacuumRoute("URURD"));
        System.out.println(vacuumRoute("RUULLDRD"));
    }

    // O(n)
    public static Boolean vacuumRoute(String moves){
        int x = 0;
        int y = 0;
        for(char move : moves.toCharArray()){
            if(move == 'U') y++;
            else if (move == 'D') y--;
            else if (move == 'R') x++;
            else if (move == 'L') x--;
        }

        return x == 0 && y == 0;
    }
}
