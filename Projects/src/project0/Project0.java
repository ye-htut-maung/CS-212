package project0;

import javax.swing.*;

public class Project0 {
    public static void main(String[] args) {
        /* Input Sentence from user */
        String inputSentence;

        /* Declare countUpperCaseE to track the number of upper case 'E' */
        int countUpperCaseE;

        /* Declare countLowerCaseE to track the number of lower case 'e' */
        int countLowerCaseE;

        /*
         * * This while loop shows that If the user input is equal to "STOP" and the
         * "STOP" is not case sensitive, the program will terminate.
         */
        while (true) {
            countUpperCaseE = 0;
            countLowerCaseE = 0;

            // asking input from the user
            inputSentence = JOptionPane.showInputDialog(null, "Please Enter a sentence");

            // If the input is equal to stop without case sensitive, the program will
            // terminate.
            if (inputSentence.equalsIgnoreCase("STOP")) {
                System.exit(0);
            }

            // This for loop is to count the upper case E and lower case E in the user
            // input.
            for (int i = 0; i < inputSentence.length(); ++i) {
                // if the character in the sentence is upper case E, add countUpperCaseE to 1, 
                // if the character in the sentence is lower case e, add countLowerCaseE to 1, 
                // if the character in the sentence is not e, do nothing and continue
                if (inputSentence.charAt(i) == 'E') {
                    ++countUpperCaseE;
                } else if (inputSentence.charAt(i) == 'e') {
                    ++countLowerCaseE;
                } else {
                    continue;
                }
            }

            // showing messages to the user
            JOptionPane.showMessageDialog(null,
                    "Number of lower case e's: " + countLowerCaseE + "\nNumber of upper case e's: " + countUpperCaseE);

        }
    }
} // class Project0
