

public class CafeUtil{


    public int getStreakGoal(){
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum+=i;
        }
        return sum;
    }

    // Ninja Bonus: Add a parameter, numWeeks so that an admin can change the number from 10 to whatever they want.
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i=1; i<=numWeeks; i++){
            sum+=i;
        }
        return sum;
    }
}