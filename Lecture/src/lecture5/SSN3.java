package lecture5;
import javax.swing.*;
public class SSN3 {
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
	   return(JOptionPane.showInputDialog(null,"Enter SSN:"));
   }
   public static void storeSSN(String s, String[] list){
	   list[ssnSize++]=s;
   }
   public static void printSSNList(String[] list, int size) {
	   for (int i=0;i<size;i++)
		   System.out.println(list[i]);
   }
} //SSN1


