package Day1;

//**My task — write a program that prints this exact output:**
//===== TEST SUITE REPORT =====
//
//Login_Valid        | PASS | 320ms   | FAST
//Login_Invalid      | FAIL | 870ms   | FAST
//Add_To_Cart        | PASS | 1500ms  | ACCEPTABLE
//Checkout_Flow      | FAIL | 4200ms  | SLOW
//Search_Product     | PASS | 950ms   | FAST
//Logout             | PASS | 280ms   | FAST
//Payment_Gateway    | FAIL | 3800ms  | SLOW
//
//===== SUMMARY =====
//Total Tests  : 7
//Passed       : 4
//Failed       : 3
//Fast (<1000ms)      : 4
//Acceptable (1000-3000ms) : 1
//Slow (>3000ms)      : 2
//
//Overall Result: NEEDS ATTENTION

//public record ResultAnalyzer(String testNames, int responseTimes, boolean testResults) {}


public class TestSuiteResultAnalyzer {
	public static void main(String[] args) { 
	String[] testNames = {
		    "Login_Valid",
		    "Login_Invalid",
		    "Add_To_Cart",
		    "Checkout_Flow",
		    "Search_Product",
		    "Logout",
		    "Payment_Gateway"
		};	
	int[] responseTimes = {320, 870, 1500, 4200, 950, 280, 3800};  // milliseconds
	boolean[] testResults = {true, false, true, false, true, true, false};
	int passedCount = 0, failedCount = 0;
    int fast = 0, acceptable = 0, slow = 0;
    
		System.out.println("===== TEST SUITE REPORT =====" );
		System.out.println("\n");
		
		for (int i = 0; i < testNames.length; i++) {
			String status = testResults[i] ? "PASS" : "FAIL";
			String speedCategory;
			
			 // Determining speed and increment counters
			
			if (responseTimes[i] <1000) {
				speedCategory = "FAST";
				fast++;
			}else if (responseTimes[i] >= 1000 && responseTimes[i] <= 3000){
				speedCategory = "ACCEPTABLE";
				acceptable++;
			} else {
				speedCategory = "SLOW";
				slow++;
			}
			
			if (testResults[i]) passedCount++; else failedCount++;
			
			System.out.printf("%-18s | %-4s | %-7s | %s%n", 
	                testNames[i], status, responseTimes[i] + "ms", speedCategory);
		}
			
			System.out.println("\n===== SUMMARY =====");
	        System.out.println("Total Tests  : " + testNames.length);
	        System.out.println("Passed       : " + passedCount);
	        System.out.println("Failed       : " + failedCount);
	        System.out.println("Fast (<1000ms)      : " + fast);
	        System.out.println("Acceptable (1000-3000ms) : " + acceptable);
	        System.out.println("Slow (>3000ms)      : " + slow);
	       
	        String overall;
	        if (failedCount == 0) {
	        	overall = "GOOD";
	        } else if (failedCount <= 2) {
	        	overall = "NEEDS ATTENTION"; 
	        } else {
	        	overall = "CRITICAL";
	        }
	        
	        System.out.println("\nOverall Result: " + overall);
		
	        
	}
}


		

