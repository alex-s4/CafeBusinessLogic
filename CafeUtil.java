

public class CafeUtil{

    /*
        Cafe Java wants to implement a reward system for customers who always 
        buy more drinks than they did the week before. To calculate how many drinks 
        they need after 10 weeks, write a method that sums together every consecutive 
        integer from 1 to 10 and returns the sum. In other words, add 1 + 2 + 3.. and 
        so on up to 10 and return the result.
    */

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

    // Given an array of item prices from an order, sum all of the prices in the array and return the total.

    public double getOrderTotal(double[] prices){
        double totalPrice = 0;
        for(double coffeePrice : prices){
            totalPrice+=coffeePrice;
        }
        return totalPrice;
    }





    
}