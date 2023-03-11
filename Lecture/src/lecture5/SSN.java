package lecture5;
import javax.swing.*;

public class SSN {
    static String ssn;
    static String[] ssnList;
    static int ssnSize;
    
    public static void main(String[] args) {
 
        ssn = readSSN();
        storeSSN(ssn, ssnList, ssnSize);
        printSSNList(ssnList, ssnSize);
    }
    
    public static String readSSN() {
        return (JOptionPane.showInputDialog(null, "Enter SSN: "));
    }
    
    public static void storeSSN(String s, String[] list, int size) {
        list[size++] = s;
    }
    
    public static void printSSNList(String[] list, int size) {
        for(int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
    }

}//SSN
