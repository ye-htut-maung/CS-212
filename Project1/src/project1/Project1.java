package project1;
import java.util.*;
/**********************************************************************
 * 
 * 
 * A program that converts from Roman numerals to Arabic numeral
 * 
 * 
 * @author Ye Htut Maung
 * 
 */



public class Project1 {
   
   // declare arrRoman string array to hold Roman numerals
   static ArrayList<String> arrRoman = new ArrayList<String>();
   // declare arrNumbers string array to hold Arabic numbers which are calculated from roman characters
   static ArrayList<String> arrNumbers = new ArrayList<String>();
   //declare myTokens to get the Roman numerals from the string 
   static StringTokenizer myTokens;
   /** Name of text file*/
   static String fileName;
   


   public static void main(String[] args) {
      // Read the file from the argument
      fileName = args[0];
      fillRomanArray(arrRoman, fileName);
      fillNumberArray(arrRoman, arrNumbers);
      // To display the output with GUI
      RomanNumeralGUI myGUI = new RomanNumeralGUI();
      myGUI.printRomanANumeral(arrRoman, arrNumbers);

   }
   
   /**
    * Fill Roman numerals from the text file to the array.
    * @param arrRoman The array to be filled
    * @param fileName The text file to be read
    */

   public static void fillRomanArray(ArrayList<String> arrRoman, String fileName) {
      // Use TextFileInput to read text file
      TextFileInput in = new TextFileInput(fileName);
      String line = in.readLine();
      // Read the text file until there is no line to read and add to the roman array
      while (line != null) {
         myTokens = new StringTokenizer(line, ",");
         while (myTokens.hasMoreTokens()) {
            arrRoman.add(myTokens.nextToken());
         }
         line = in.readLine();
      }
   }
   
   /**
    * Calculate Roman numeral to Arabic numeral
    * @param roman The string to be converted to Arabic numeral
    * @return integer The Arabic numeral converted from the Roman numeral
    */

   public static int calculateRomToInt(String roman) {
      int total = 0;

      // calculate Arabic numeral from Roman numeral
      for (int i = 0; i < roman.length(); i++) {
         switch (roman.charAt(i)) {
         case 'M':
            total += 1000;
            if (i != 0 && roman.charAt(i - 1) == 'C') {
               total -= 200;
            }
            break;
         case 'D':
            total += 500;
            if (i != 0 && roman.charAt(i - 1) == 'C') {
               total -= 200;
            }
            break;
         case 'C':
            total += 100;
            if (i != 0 && roman.charAt(i - 1) == 'X') {
               total -= 20;
            }
            break;
         case 'L':
            total += 50;
            if (i != 0 && roman.charAt(i - 1) == 'X') {
               total -= 20;
            }
            break;
         case 'X':
            total += 10;
            if (i != 0 && roman.charAt(i - 1) == 'I') {
               total -= 2;
            }
            break;
         case 'V':
            total += 5;
            if (i != 0 && roman.charAt(i - 1) == 'I') {
               total -= 2;
            }
            break;
         case 'I':
            total += 1;
            break;
         }
      }

      return total;
   }
   
   /**
    * Fill Arabic numerals which are converted from Roman numerals to the array 
    * @param arrRoman The array of Roman numeral
    * @param arrNumbers The array of Arabic numeral
    */

   public static void fillNumberArray(ArrayList<String> arrRoman, ArrayList<String> arrNumbers) {
      // add calculated numbers to Arabic array
      for (String roman : arrRoman) {
         arrNumbers.add(Integer.toString(calculateRomToInt(roman)));
      }
   }

}
