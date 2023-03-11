package lecture6;
import javax.swing.*;
import java.awt.*;
public class GUI_Test{
   static final int LIST_SIZE = 10;
   static String ssn;
   static String[] ssnList;
   static int ssnSize;
   static TextFileInput inFile;
   static String inFileName = "SSN.txt";
   static JFrame myFrame;
   
   public static void main(String[] args) {
      initialize();
      readSSNsFromFile(inFileName);
      printSSNList(ssnList,ssnSize);
      printSSNtoJFrame(myFrame,ssnList,ssnSize);
   }   
   public static void initialize() {
	   ssn="";
	   ssnList= new String[LIST_SIZE];
	   ssnSize=0;
       inFile = new TextFileInput(inFileName);
       myFrame=new JFrame();
       myFrame.setSize(400,200);
       myFrame.setLocation(100, 100);
       myFrame.setTitle("Social Security Numbers");
       myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public static void readSSNsFromFile(String fileName){
	   String ssn;
       ssn = inFile.readLine();
       while (ssn != null) {
          assert (isValidSSN(ssn)): "SSN not valid";
          if (!isValidSSN(ssn))
        	  throw new IllegalArgumentException("Invalid SSN");
          else
        	  storeSSN(ssn,ssnList);
          ssn = inFile.readLine();
       } //while
   } //readSSNsFromFile
   
   public static void storeSSN(String s, String[] list){
	   assert (isValidSSN(s)): "The SSN is not valid";
	   assert (isValidList(list)): "The array is not valid";
	   
	   if (isValidSSN(s) && isValidList(list))
          list[ssnSize++]=s;
	   assert (isValidList(list)):"Resulting list not valid";
   }
   
   public static void printSSNList(String[] list, int size) {
	   assert (isValidList(list)): "The array is not valid";
	   if (!isValidList(list)){
		   throw new IllegalArgumentException("Invalid list)");
	   }
	   for (int i=0;i<size;i++)
		   if (!isValidSSN(list[i]))
			   System.out.println("Invalid SSN: "+list[i]);
           else
               System.out.println(list[i]);
   }
   
   public static void printSSNtoJFrame(JFrame jf, String[] list, int size) {
	   assert (isValidList(list)): "The array is not valid";
	   if (!isValidList(list)){
		   throw new IllegalArgumentException("Invalid list)");
	   }
	   Container myContentPane = jf.getContentPane();
	   TextArea myTextArea = new TextArea();
	   myContentPane.add(myTextArea);
	   
	   for (int i=0;i<size;i++)
		   if (!isValidSSN(list[i]))
			   myTextArea.append("Invalid SSN: "+list[i]+"\n");
           else
               myTextArea.append(list[i]+"\n");
	   jf.setVisible(true);
   } 
   
   public static boolean isValidSSN(String s) {
	   if (s.length() != 9) {
		 throw new IllegalArgumentException("An SSN length must be 9");
	   }
	   for (int i=0;i<9;i++)
		   if (! Character.isDigit(s.charAt(i))) {
			   throw new IllegalArgumentException("SSN must have only digits.");
       }
	   return (true);
   }
   public static boolean isValidList(String[] list){
	   if (list == null){
	      return false;
	   }
       if (ssnSize == list.length){
          return false;
       }
       return (true);
   }
} //SSN

