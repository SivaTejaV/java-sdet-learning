//package com.sivateja.selenium_framework;
package Day2;

public class Day2Methods {

    // METHOD 1 — void method (does something, returns nothing)
    public static void printWelcome(String name) {
        System.out.println("Welcome, " + name + "! Tests are starting.");
    }

    // METHOD 2 — returns a String
    public static String getSpeedLabel(int responseTime) {
        if (responseTime < 1000) {
            return "FAST";
        } else if (responseTime <= 3000) {
            return "ACCEPTABLE";
        } else {
            return "SLOW";
        }
    }

    // METHOD 3 — returns a boolean
    public static boolean isTestPassed(int statusCode) {
        return statusCode == 200 || statusCode == 201;
    }

    // METHOD 4 — returns an int
    public static int calculateTotal(int pass, int fail) {
        return pass + fail;
    }

    // main method — this is where we CALL all the methods above
    public static void main(String[] args) {

        // Calling METHOD 1
        printWelcome("Siva Teja");

        // Calling METHOD 2
        String label1 = getSpeedLabel(320);
        String label2 = getSpeedLabel(1500);
        String label3 = getSpeedLabel(4200);
        System.out.println("320ms  → " + label1);
        System.out.println("1500ms → " + label2);
        System.out.println("4200ms → " + label3);

        // Calling METHOD 3
        boolean result1 = isTestPassed(200);
        boolean result2 = isTestPassed(404);
        System.out.println("Status 200 passed: " + result1);
        System.out.println("Status 404 passed: " + result2);

        // Calling METHOD 4
        int total = calculateTotal(4, 3);
        System.out.println("Total tests run: " + total);
    }
}