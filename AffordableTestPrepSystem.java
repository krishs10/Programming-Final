//The purpose of this code is to make a user friendly standardized test cost calculator.
//Source: https://blog.prepscholar.com/sat-cost-act-cost-and-how-to-save-money


import java.util.Scanner;
public class AffordableTestPrepSystem {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculate testCostCalculator = new Calculate();


        int grandTotal = 0; //int data type 1 and a variable


        String[] tests = {"SAT", "ACT", "AP"};


        for (String test : tests) { //iteration
            grandTotal += testCostCalculator.calculateTotalCost(test, scanner);
        }


        System.out.println("Grand Total: $" + grandTotal);


        scanner.close();
    }
}
