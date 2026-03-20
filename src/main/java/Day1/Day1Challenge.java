package Day1;

public class Day1Challenge {

    public static void main(String[] args) {

        int[] statusCodes = {200, 404, 201, 500, 200, 401, 200};
        int passCount = 0;
        int failCount = 0;

        // YOUR CODE HERE:
        // 1. Loop through all statusCodes
        // 2. For each code, check if it's 200 or 201
        // 3. Print "PASS: 200" or "FAIL: 404" accordingly
        // 4. Increment passCount or failCount
        for (int i = 0; i < statusCodes.length; i++) {
        	if (statusCodes[i] == 200 ||statusCodes[i] == 201 ) {
        		System.out.println("Pass: " + statusCodes[i]);
        		passCount++;
        	}  else {
        		System.out.println("Fail: " + statusCodes[i]);
        		failCount++;
        		
        	}
        }

        // After the loop, print:
        
        System.out.println("-------------------");
        System.out.println("Total PASS: " + passCount);
        System.out.println("Total FAIL: " + failCount);
    }
	
}













