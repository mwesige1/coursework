
package revisedwork;

public class Marathon {
 public static void main(String[] args) {
        // Names of the runners
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", 
            "Alex", "Emma", "John", "James", "Jane", "Emily", 
            "Daniel", "Neda", "Aaron", "Kate"
        };

        // Times in minutes
        int[] time = {
            341, 273, 278, 329, 445, 402, 
            388, 275, 243, 334, 412, 393, 
            299, 343, 317, 265
        };

        // Variables to hold indices of the fastest and second fastest runners
        int fastest = 0;
        int secondFastest = 1;

        // Find the fastest runner
        for (int i = 1; i < time.length; i++) {
            if (time[i] < time[fastest]) {
                secondFastest = fastest; // Update second fastest before updating fastest
                fastest = i;  } 

            else if (time[i] < time[secondFastest] || time[secondFastest] == time[fastest]) {
                secondFastest = i; 
            }
       }
           System.out.println("Fastest Runner: " + names[fastest] + " with time: " + time[fastest] + " minutes.");
          System.out.println("Second Fastest Runner: " + names[secondFastest] + " with time: " + time[secondFastest] + " minutes.");

 }
}