package lecture5;
import javax.swing.*;
public class SSN4 {
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
	   if (ssn.length() != 9) {
		   System.out.println("An SSN length must be 9");
           System.exit(0);
	   }
	   for (int i=0;i<9;i++)
		   if (! Character.isDigit(ssn.charAt(i))) {
			   System.out.println("SSN must have only digits.");
			   System.exit(0);
		   }
	   return ssn;
   }
   public static void storeSSN(String s, String[] list){
	   if (ssn.length() != 9) {
		   System.out.println("An SSN length must be 9");
           System.exit(0);
	   }
	   for (int i=0;i<9;i++)
		   if (! Character.isDigit(ssn.charAt(i))) {
			   System.out.println("SSN must have only digits.");
			   System.exit(0);
		   }
	   if (list == null){
		   System.out.println("Array is null.");
		   System.exit(0);
	   }
	   if (ssnSize == list.length){
		   System.out.println("Can't store any more SSNs");
		   System.exit(0);
	   }
	   list[ssnSize++]=s;
   }
   public static void printSSNList(String[] list, int size) {
	   for (int i=0;i<size;i++)
		   System.out.println(list[i]);
   }
} //SSN


