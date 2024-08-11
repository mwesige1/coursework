

package revisedwork;


public class RevisedWork {
   public static void main(String[] args) {
        
        balexCompany company = new balexCompany();

        
        double[][] employees = {
            {7.50, 35},  
            {8.20, 47},  
            {10.00, 73}  
        };  

        
        for (double[] employee : employees) {
            double basePay = employee[0];
            double hours = employee[1];
            String result = company.calculatePay(basePay, hours);
            System.out.println(result);
        }
    }
} 


    
