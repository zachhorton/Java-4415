/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1firstlastname;

/**
 *
 * @author u0476829
 */
public class Hw1FirstLastName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*****Task 1*****");
        // Input your name        
        String name = "zach horton";
        // Calculate name length
        int nameLength = name.length();
        // Set test bool
        boolean testPass = true;
        
        // Iterate over name for Alphabetic test
        for (int i = 0; i < nameLength; i++) {
            char letter = name.charAt(i);
            boolean alpha = Character.isAlphabetic(letter);
            boolean space = Character.isSpaceChar(letter);
            if (!alpha && !space){
                testPass = false;
            }
        }
        // Print out if name is valid or not
        if (testPass) {
            System.out.println("Your name is valid!");
        } else {
            System.out.println("Sorry, your name contains non-alphabets and is invalid.");
            // End Task 1
        }
        
        // If the name is valid, continue to Task 2 & Task 3
        if (testPass) {
            // Begin Task 2
            System.out.println("*****Task 2*****");
            // Locate index of the space character, if present
            int spaceIndex = name.indexOf(" ");
            char firstChar;
            if (spaceIndex == -1) {
                System.out.println("Hello " + name);
            } else {
                firstChar = name.charAt(0);
                System.out.println("Hello " + Character.toUpperCase(firstChar) + name.substring(1, spaceIndex));
                // End Task 2
            }
            
            // Begin Task 3
            System.out.println("*****Task 3*****");
            // Declare Variables
            double asciiTotal = 0;
            double asciiMean = 0;
            int i = 0;
            // Calculate ASCII total by iterating over each char
            while (i < nameLength) {
                asciiTotal = asciiTotal + name.charAt(i);
                i = i + 1;
            }
            // Print out the ASCII total and mean value --
            System.out.println("The ASCII Total Value is: " + asciiTotal);
            System.out.println("The ASCII Mean Value is: " + asciiTotal / nameLength);
            // end Task 3
        }
        
        
    }
}
