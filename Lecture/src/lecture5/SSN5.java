package lecture5;
import javax.swing.*;
public class SSN5 {
   static String ssn;
   static String[] ssnList;
   static int ssnSize;
   public static void main(String[] args) {
      initialize();
      ssn = readSSN();
      storeSSN(ssn,ssnList);
      printSSNList(ssnList,ssnSize);
   }
   public static void initialize() {
	   ssn="";
	   ssnList= new String[10];
	   ssnSize=0;
   }
   public static String readSSN(){
	   String ssn;
	   ssn = (JOptionPane.showInputDialog(null,"Enter SSN:"));
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


