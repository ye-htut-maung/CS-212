package lecture5;
import javax.swing.*;
public class SSN7 {
   static String ssn;
   static String[] ssnList;
   static int ssnSize;
   static TextFileInput inFile;
   static String inFileName = "SSN.txt";
   
   public static void main(String[] args) {
      initialize();
      do {
        ssn = readSSN();
        storeSSN(ssn,ssnList);
        printSSNList(ssnList,ssnSize);
 
      }
      while (!ssn.equals("000000000"));
   }   
   public static void initialize() {
	   ssn="";
	   ssnList= new String[10];
	   ssnSize=0;
       inFile = new TextFileInput(inFileName);
   }
   public static String readSSN(){
	   String ssn;
       ssn = inFile.readLine();
       if(ssn == null)
    	   return "000000000";
       else
	      if (isValidSSN(ssn))
             return ssn;
	      else
		     return null;
   }
   public static void storeSSN(String s, String[] list){
	   if (isValidSSN(s) && isValidList(list))
	   	   list[ssnSize++]=s;
   }
   public static void printSSNList(String[] list, int size) {
	   if (!isValidList(list)){
		   System.out.println("Can't print from invalid list.");
		   System.exit(0);
	   }
	   for (int i=0;i<size;i++)
		   if (!isValidSSN(list[i]))
			   System.out.println("Invalid SSN: "+list[i]);
           else
               System.out.println(list[i]);
   }
   public static boolean isValidSSN(String s) {
	   if (s.length() != 9) {
		   System.out.println("An SSN length must be 9");
           return(false);
	   }
	   for (int i=0;i<9;i++)
		   if (! Character.isDigit(s.charAt(i))) {
			   System.out.println("SSN must have only digits.");
			   return(false);
		   }
	   return (true);
   }
   public static boolean isValidList(String[] list){
	   if (list == null){
	          System.out.println("Array is null.");
	          System.exit(0);
	   }
       if (ssnSize == list.length){
          System.out.println("Can't store any more SSNs");
          System.exit(0);
       }
       return (true);
   }
} //SSN


