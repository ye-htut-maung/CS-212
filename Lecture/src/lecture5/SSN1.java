package lecture5;
public class SSN1 {
   static String ssn;
   static String[] ssnList;
   static int ssnSize;
   public static void main(String[] args) {
      ssn = readSSN();
      storeSSN(ssn,ssnList,ssnSize);
      printSSNList(ssnList,ssnSize);
   }
   public static String readSSN(){return "";}
   public static void storeSSN(String s, String[] list, int size){}
   public static void printSSNList(String[] list, int size) {}
} //SSN1


