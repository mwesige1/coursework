
package forexburea.coursework;


public class balexCompany {

    // Method to calculate pay based on base pay and hours worked
    public String calculatePay(double basePay, double hoursWorked) {
        // Constants
        final double MINIMUM_WAGE = 8.00;
        final double MAX_HOURS = 60;
        final double OVERTIME_RATE = 1.5;
        final double REGULAR_HOURS = 40;

        // Error handling for base pay
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Base pay must not be less than the minimum wage of $8.00."); 
        }

        // Error handling for hours worked
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked cannot exceed 60 hours in a week."); 
        }

        // Calculate total pay
        double totalPay;
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = hoursWorked * basePay;
        } else {
            double regularPay = REGULAR_HOURS * basePay;
            double overtimeHours = hoursWorked - REGULAR_HOURS;
            double overtimePay = overtimeHours * (basePay * OVERTIME_RATE);
            totalPay = regularPay + overtimePay;
        }

        return String.format("Total pay for %.2f hours worked at $%.2f/hour is $%.2f.", hoursWorked, basePay, totalPay);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create an instance of BalexCompany
        balexCompany company = new balexCompany();

        // Employee data
        double[][] employees = {
            {7.50, 35},  // Employee 1
            {8.20, 47},  // Employee 2
            {10.00, 73}  // Employee 3
        };  

        // Calculate and print pay for each employee
        for (double[] employee : employees) {
            double basePay = employee[0];
            double hours = employee[1];
            String result = company.calculatePay(basePay, hours);
            System.out.println(result);
        }
    }
}
