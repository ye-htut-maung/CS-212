package lab12;
import javax.swing.*;
import java.awt.*;
public class Lab12{
   
   static TextFileInput inFile;
   static String inFileName;
   static JFrame myFrame;
   static Container cPane;
   static TextArea even, odd;
   
   public static void main(String[] args) {
      inFileName = args[0];
      initialize();
      readNumbersFromFile(inFileName);
     
      
   }   
   public static void initialize() {
      inFile = new TextFileInput(inFileName);
      even = new TextArea();
      odd = new TextArea();
      myFrame=new JFrame();
      myFrame.setSize(400,400);
      myFrame.setLocation(200, 200);
      myFrame.setTitle("Even & Odd");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      myFrame.setLayout(new GridLayout(1,2));
      cPane = myFrame.getContentPane();
   }
   public static void readNumbersFromFile(String fileName){
      /*
       * Add code to this method so...
       * - the two text areas are added to the content pane of the JFrame
       *   (see the code in the PowerPoint on GUIs)
       * - numbers are read from the file, and even numbers are put in 
       *   the TextArea "even", odd numbers in "odd".
       * - At end of file, the JFrame is made visible.
       */
      String line;
      int number;
      line = inFile.readLine();
      while (line != null) {
          number = Integer.parseInt(line);
          if (number % 2 == 0) {
             even.append(Integer.toString(number) + "\n");
          } else {
             odd.append(Integer.toString(number)+ " \n");
          }
          
          line = inFile.readLine();
       } //while
      

      cPane.add(even);
      cPane.add(odd);
      myFrame.setVisible(true);
      
   } //readSSNsFromFile
   
      
   
   
   
} //SSN

