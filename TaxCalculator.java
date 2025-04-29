import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        // Given values for age and income
        int age = 23;
        double income = 9000;
        
        // Check if the person is under 18 years old
        if (age < 18) {
            System.out.println("NO TAX: You are under 18 years old.");
        } else {
            // Calculate the tax based on income
            double tax = 0;

            if (income < 10000) {
                tax = 0; // No tax if income is less than 10,000
            } else if (income >= 10000 && income <= 20000) {
                tax = income * 0.05; // 5% tax if income is between 10,000 and 20,000 (inclusive)
            } else {
                tax = income * 0.10; // 10% tax if income is greater than 20,000
            }

            // Output the calculated tax
            System.out.println("The tax to be paid is: $" + tax);
        }
    }
}
