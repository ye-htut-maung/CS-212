package experiment1;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Cat_GUI extends JFrame {

   public void initialize() {
      setSize(500, 300);
      setLocation(200, 200);
      setTitle("Roman Numeral");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }

   public void printRomanANumeral(ArrayList<String> arrRoman, ArrayList<String> arrNumbers) {
      setLayout(new GridLayout(1, 2));
      Container myContentPane = getContentPane();
      TextArea myRoman = new TextArea();
      TextArea myNumbers = new TextArea();
      myContentPane.add(myRoman);
      myContentPane.add(myNumbers);
      
      for (String roman: arrRoman) {
         myRoman.append(roman + "\n");
      }
      for (String number: arrNumbers) {
         myNumbers.append(number + "\n");
      }

   }

}
