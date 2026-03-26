package Day2;

public class Day2AutomatedLoginValidator {
	
	public static String validateUsername(String username) {
	    if (username == null || username.isEmpty()) return "INVALID";
	    if (username.contains("locked")) return "LOCKED";
	    if (username.equals("admin")) return "INVALID";  // treat admin as invalid
	    return "VALID";
	}
	
	public static boolean validateLogin(String username, String password) {
	    if (username == null || password == null) return false;
	    if (username.isEmpty() || password.isEmpty()) return false;
	    if (username.contains("locked")) return false;
	    if (username.equals("admin")) return false;
	    
	    // Only allow standard_user with correct password
	    if (username.equals("standard_user") && password.equals("secret_sauce")) {
	        return true;
	    }
	    return false;
	}   
	public static String isMatchingExpected(boolean actual, boolean expected) {
		return actual == expected ? "MATCH" : "MISMATCH"; 
	}
	
	public static void printLoginRow(String u, String p, String uStatus, boolean actual, boolean expected) {
		String status = uStatus;
		if (uStatus.equals("VALID") && !actual) {
			status = "INVALID"; 
		}
		String matchResult = isMatchingExpected(actual, expected);
		System.out.printf("%-14s | %-12s| %-8s | %-4s | %s%n", 
                u.isEmpty() ? " " : u, 
                p.isEmpty() ? " " : p, 
                status, 
                actual ? "PASS" : "FAIL", 
                matchResult);
	}
	
	public static void printAccuracy(int correct, int total) {
		int percentage = (correct * 100) / total;
		System.out.println("Accuracy    : " + percentage + "%"); 
	}

	public static void main(String[] args) {
		String[] usernames = {"standard_user", "", "admin", "locked_user", "standard_user", "guest"};
		String[] passwords = {"secret_sauce", "secret_sauce", "admin123", "secret_sauce", "wrong_pass", ""};
		boolean[] expectedPass = {true, false, false, false, false, false};
		
		System.out.println("===== LOGIN VALIDATION REPORT =====");
		
		
		int correctResults = 0;
		
		for (int i = 0; i <usernames.length; i++) {
			String u = usernames[i];
            String p = passwords[i];
            boolean expected = expectedPass[i];
            
            String uStatus = validateUsername(u);
            boolean loginPassed = validateLogin(u, p);
            
            if (isMatchingExpected(loginPassed, expected).equals("MATCH")) {
                correctResults++;
            } 
            printLoginRow(u, p, uStatus, loginPassed, expected);
            
		}
		System.out.println("===== SUMMARY =====");
		System.out.println("Total attempts : " + usernames.length);
		System.out.println("Correct results : " + correctResults);
		printAccuracy(correctResults, usernames.length);
	}
}
