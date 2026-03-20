package Day1;

public class FirstProgram {
	
	public static void main(String[ ] args) {
		System.out.println("Hi this the output from FirstProgram.java file in maven proejct");
		System.out.println("I am learning Java for SDET role.");
		System.out.println("Today is Day 1.");
		System.out.println(10 + 20);
	
		// --- int ---
//		int waitTime = 10;
//		int statusCode = 200;
//		System.out.println("Wait time: " + waitTime + " seconds");
//		System.out.println("Status code: " + statusCode);
//
//		// --- double ---
//		double responseTime = 1.435;
//		System.out.println("API response time: " + responseTime + "s");
//
//		// --- boolean ---
//		boolean isLoggedIn = true;
//		boolean hasError = false;
//		System.out.println("Logged in: " + isLoggedIn);
//		System.out.println("Has error: " + hasError);
//
//		// --- String ---
//		String username = "standard_user";
//		String url = "https://www.saucedemo.com";
//		System.out.println("Testing URL: " + url);
//		System.out.println("Username has 'user': " + username.contains("user"));
//		System.out.println("Username uppercase: " + username.toUpperCase());
//
//		// --- char ---
//		char grade = 'A';
//		System.out.println("Test grade: " + grade);
//		
		
//		int statusCode = 404;
//		int responseTime = 2500;
//		boolean isLoggedIn = false;
//		
//		// if / else if / else
//		
//		if (statusCode == 200) {
//			System.out.println("PASS: Request was successful");
//		} else if (statusCode == 404) {
//			System.out.println("FAIL: Page Not Found");
//		} else {
//			System.out.println("FAIL: Unexpected Status code - " + statusCode);	
//		}
//		
//		// Combining operators in a real test scenario
//		if (statusCode == 200 && responseTime < 3000) {
//			System.out.println("PASS: Response OK and within time limit");
//		} else {
//			System.out.println("FAIL: Either bad status or too slow");
//		}
//		
//		// NOT operator
//		
//		if (!isLoggedIn) {
//			System.out.println("User is not logged in, redirecting...");
//		} else {
//			System.out.println("User is logged in, proceeding to test");
//			
//		}
		// --- FOR LOOP ---
		// Run a test 3 times (retry logic concept)
		for (int i = 1; i <= 3; i++) {
		    System.out.println("Running test attempt: " + i + "\n");
		}
		 
		
		
		// Loop through test usernames
		String[] users = {"standard_user", "locked_out_user", "problem_user"};
		for (int i = 0; i < users.length; i++) {
			System.out.println("Testing login for:" + users[i]+ "\n");
		}
		
		// Enhanced for-each loop (cleaner, use this when you don't need the index)
		for (String user : users) {
			System.out.println("Verifying user: " + user);	
		}
		
		// --- WHILE LOOP ---
		// Keep waiting until element appears (concept used in custom waits)

		int attempts = 0;
		int maxAttempts = 5;
		
		while (attempts < maxAttempts) {
			System.out.println("Checking if element is visible, attempt: " + (attempts+1));
			attempts++;
		}
		System.out.println("\n");
		
		int negAttempts = -5;
		int negMaxAttempts = 0;
		
		while (negAttempts < negMaxAttempts) {
			System.out.println("Checking if element is visible, attempt: " + (negAttempts));
			negAttempts++;
		}
		
//		Switch Statement
		
		int statusCode = 404;
		switch (statusCode) {
		    case 200:
		        System.out.println("OK - Request successful");
		        break;
		    case 201:
		        System.out.println("Created - Resource created successfully");
		        break;
		    case 400:
		        System.out.println("Bad Request - Check your input");
		        break;
		    case 401:
		        System.out.println("Unauthorized - Login required");
		        break;
		    case 404:
		        System.out.println("Not Found - Endpoint does not exist");
		        break;
		    case 500:
		        System.out.println("Server Error - Backend issue");
		        break;
		    default:
		        System.out.println("Unknown status code: " + statusCode);
		}
		
	}
 
}
