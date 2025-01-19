/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024218;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Git_2024218 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(" Guilherme - 2024218");
        
       // GUILHERME SOUZA DOS SANTOS. STUDENT NUMBER: 2024218  
        
     // import from library to get input 
         Scanner myKB = new Scanner(System.in);
         
        String name;

        // Loop for input validation
        System.out.print("Please enter your name: ");
        name = myKB.nextLine();

        // Loop to validate user input
        // The loop continues until a valid name (no numbers and not empty) is provided
        while (name.trim().isEmpty() || name.matches(".*[0-9].*")) {

            // Check if the input is empty (after trimming whitespace)
            if (name.trim().isEmpty()) {
                System.out.println("Error: Your name cannot be empty.");
            }
            
            // Check if the input contains any numbers
            else if (name.matches(".*[0-9].*")) {
                System.out.println("Error: Your name cannot contain numbers.");
            }

            // Prompt the user to enter their name again
            System.out.print("Please enter your name: ");
            name = myKB.nextLine();
        }

        // Using the length of the name (after trimming) as an example of a string method
        int nameLength = name.trim().length();

        // Display a thank-you message and inform about the name's length
        System.out.println("Thank you, " + name.trim() + ". Your name has " + nameLength + " characters.");
    }
    }
  
