package Day2;
public class Day2Refactor {
    // Method 1 — takes a boolean, returns "PASS" or "FAIL"
    public static String getStatus(boolean result) {
//        if (result == true) {
//        	return "PASS";
//        } else {
//        	return "FAIL";
//        }
    	return result ? "PASS" : "FAIL";	
    }
    // Method 2 — takes responseTime, returns "FAST", "ACCEPTABLE" or "SLOW"
    public static String getSpeedLabel(int responseTime) {
        
    	if (responseTime < 1000) {
    		return "FAST";
    		
    	} else if (responseTime >= 1000 && responseTime <= 3000) {
    		return "ACCEPTABLE";    		
    	} else {
    		return "SLOW";
    	}    	
    }
    // Method 3 — takes failCount, returns "ALL GOOD", "NEEDS ATTENTION" or "CRITICAL"
    public static String getOverallResult(int failCount) {
        if (failCount == 0) {
            return "ALL GOOD";
        } else if (failCount <= 2) {
            return "NEEDS ATTENTION";
        } else {
            return "CRITICAL";
        }
    }
    // Method 4 — prints one test row using the methods above
    public static void printTestRow(String name, boolean result, int responseTime) {
        String status = getStatus(result);           // call method 1
        String speed  = getSpeedLabel(responseTime); // call method 2
        System.out.printf("%-18s | %-4s | %-7s | %s%n",
                name, status, responseTime + "ms", speed);
    }
    public static void main(String[] args) {
        String[] testNames    = {"Login_Valid","Login_Invalid","Add_To_Cart",
                                 "Checkout_Flow","Search_Product","Logout","Payment_Gateway"};
        int[]    responseTimes = {320, 870, 1500, 4200, 950, 280, 3800};
        boolean[] testResults  = {true, false, true, false, true, true, false};
        int passCount = 0, failCount = 0;
        int fast = 0, acceptable = 0, slow = 0;
        System.out.println("===== TEST SUITE REPORT =====\n");
        for (int i = 0; i < testNames.length; i++) {
            // Call printTestRow here — just ONE line per test
            printTestRow(testNames[i], testResults[i], responseTimes[i]);
            // Count pass/fail
            if (testResults[i]) passCount++; else failCount++;
            // Count speed categories using getSpeedLabel
            String speed = getSpeedLabel(responseTimes[i]);
            if (speed.equals("FAST")) fast++;
            else if (speed.equals("ACCEPTABLE")) acceptable++;
            else slow++;
        }
        System.out.println("\n===== SUMMARY =====");
        System.out.println("Total Tests  : " + testNames.length);
        System.out.println("Passed       : " + passCount);
        System.out.println("Failed       : " + failCount);
        System.out.println("Fast (<1000ms)           : " + fast);
        System.out.println("Acceptable (1000-3000ms) : " + acceptable);
        System.out.println("Slow (>3000ms)           : " + slow);
        System.out.println("\nOverall Result: " + getOverallResult(failCount));
    }
}
