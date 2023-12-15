import java.util.Scanner;


public class Calculate{ //new class


 private static int[] testFee = {60, 63, 100}; //array data type 2
    private static int[] lateFee = {90, 99, 130};


    int calculateTotalCost(String test, Scanner scanner) {
        System.out.println("Enter the number of students for " + test + ": ");


        int numStudents = scanner.nextInt();
        if(numStudents < 0)
        {
           numStudents = Math.abs(numStudents);


        }
        scanner.nextLine();


        System.out.println("Was your registration late for " + test + "? (y/n): ");
        String late = scanner.nextLine(); //String data type 3


        int index = getIndex(test);
        if (index != -1) { //conditional
            return late.equals("y") ? lateFee[index] * numStudents : testFee[index] * numStudents;
        } else {
            System.out.println("Invalid test type");
            return 0;
        }
    }


    private int getIndex(String test) {
        String[] tests = {"SAT", "ACT", "AP"};
        for (int i = 0; i < tests.length; i++) {
            if (tests[i].equals(test)) {
                return i;
            }
        }
        return -1;
    }
}
