package GreedyAlgos;

public class Lunchtime {


    // This question is asked by Apple. You are serving people in a lunch line and need to ensure each person
    // gets a “balanced” meal. A balanced meal is a meal where there exists the same number of food items as drink items.
    // Someone is helping you prepare the meals and hands you food items (i.e. F) or a drink items (D) in the
    // order specified by the items string. Return the maximum number of balanced meals you are able to create without
    // being able to modify items.
    //Note: items will only contain F and D characters.
    public static void main(String[] args) {
        String items1 = "FDFDFD";
        String items2 = "FDFFDFDD";

        System.out.println(balancedMeal(items1)); // 3
        System.out.println(balancedMeal(items2)); // 2
    }


    // Runtime: O(N) where N is the number of items we’re given.
    // Space complexity: O(1) or constant as the amount of memory we use does not increase as our number of items increase.
    private static int balancedMeal(String items) {
        int count = 0;
        int balancedMeals = 0;

        for(char item : items.toCharArray()){
            if(item == 'F'){
                count++;
            } else if (item == 'D'){
                count--;
            }
            if(count == 0){
                balancedMeals++;
            }
        }

        return balancedMeals;
    }
}
