package project1;

import java.awt.*;
import java.util.*;
import javax.swing.*;


/**
 * The GUI of Roman numeral to Arabic numeral
 * @author Ye Htut Maung
 * 
 */
public class RomanNumeralGUI extends JFrame {

   /**
    * Constructor - Creating a User Interface
    */
   public RomanNumeralGUI() {
      setSize(500, 300);
      setLocation(200, 200);
      setTitle("Roman Numeral");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }
   
   /**
    * Print two columns: one column with individual Roman numeral and another column with corresponding
    *  lines with Arabic value
    * @param arrRoman The array with Roman numerals
    * @param arrNumbers The array with Arabic numerals
    */

   public void printRomanANumeral(ArrayList<String> arrRoman, ArrayList<String> arrNumbers) {
      
      // Creating 1 row 2 column GUI  and using text area to show the result
      setLayout(new GridLayout(1, 2));
      Container myContentPane = getContentPane();
      TextArea myRoman = new TextArea();
      TextArea myNumbers = new TextArea();
      myRoman.setEditable(false);
      myNumbers.setEditable(false);
      myContentPane.add(myRoman);
      myContentPane.add(myNumbers);
      
      
      // printing Roman numeral to GUI
      for (String roman: arrRoman) {
         myRoman.append(roman + "\n");
      }
      // printing Arabic numeral to GUI
      for (String number: arrNumbers) {
         myNumbers.append(number + "\n");
      }

   }

}
