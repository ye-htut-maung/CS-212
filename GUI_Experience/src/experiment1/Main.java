package experiment1;

import java.util.*;

public class Main {

   public static ArrayList<String> arrRoman = new ArrayList<String>();
   public static ArrayList<String> arrNumbers = new ArrayList<String>();
   public static StringTokenizer myTokens;

   public static void main(String[] args) {

      String fileName = "input.txt";
      fillRomanArray(arrRoman, fileName);
      fillNumberArray(arrRoman, arrNumbers);

      Cat_GUI myGUI = new Cat_GUI();
      myGUI.initialize();
      myGUI.printRomanANumeral(arrRoman, arrNumbers);

   }

   public static void fillRomanArray(ArrayList<String> arrRoman, String fileName) {
      TextFileInput in = new TextFileInput(fileName);
      String line = in.readLine();
      while (line != null) {
         myTokens = new StringTokenizer(line, ",");
         while (myTokens.hasMoreTokens()) {
            arrRoman.add(myTokens.nextToken());
         }
         line = in.readLine();
      }
   }

   public static int calculateRomToInt(String roman) {
      int total = 0;

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

   public static void fillNumberArray(ArrayList<String> arrRoman, ArrayList<String> arrNumbers) {

      for (String roman : arrRoman) {
         arrNumbers.add(Integer.toString(calculateRomToInt(roman)));
      }
   }

}
