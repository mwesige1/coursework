
package revisedwork;


public class balexCompany {
       // Constants
     final double minWage = 8.00;
      final double maxHours= 60;
     final double overtimeWage= 1.5;
     final double regularhours = 40;

    // Method to calculate pay based on base pay and hours worked
    public String calculatePay(double basePay, double hoursWorked) {
        // Error handling for base pay , normal basepay $8.0
        if (basePay < minWage) {
            return String.format("Error: Base pay must not be less than the minimum wage of $%.2f.", minWage);
        }

        // Error handling for hours worked, normal hours worked 40 hrs
        if (hoursWorked > maxHours) {
            return "Error: Hours worked cannot exceed 60 hours in a week.";
        }

        // Calculate total pay
        double totalPay;
        if (hoursWorked <= regularhours) {
            totalPay = hoursWorked * basePay;
        } 
        else {
            double Pay = regularhours * basePay;
            double overtime = hoursWorked - regularhours;
            double overtimePay = overtime * (basePay * overtimeWage);
            totalPay = Pay + overtimePay;
        }

        return String.format("Total pay for %.2f hours worked at $%.2f/hour is $%.2f.", hoursWorked, basePay, totalPay);
    }
}
