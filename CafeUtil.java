import java.util.ArrayList;
import java.text.NumberFormat;

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

    /*
    Given an ArrayList of menu items (strings), print out each index and menu item.
    Sample output given an ArrayList with the items "drip coffee", "cappuccino", "latte" and "mocha"
    */

    public void displayMenu(ArrayList <String> menuItems){
        for(int i=0; i<menuItems.size(); i++){
            System.out.printf("%d %s",i, menuItems.get(i) + "\n");
        }
    }


    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s", userName + "\n");
        System.out.println("There are " +customers.size()+ " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(product);
        for(int i=1; i<=maxQuantity; i++){
            double totalPrice = i*price;
            String priceCurrency = currency.format(totalPrice);

            System.out.println(i+" - "+priceCurrency);
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        if (menuItems.size() != prices.size()){
            return false;
        } else if (menuItems.size() == prices.size()){
            for(int i=0;i<menuItems.size();i++){
                String formattedPrice = currency.format(prices.get(i));
                System.out.println(i+" "+menuItems.get(i)+" "+formattedPrice);
            }   
        }
        return true;
    }

}