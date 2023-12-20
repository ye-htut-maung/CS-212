package lab14;

public class Main {
   public static void main(String[] args) {
      Money m1 = new Money(6,5);
      Money m2 = new Money (6,152);
      
      System.out.println(m1.toString());
      System.out.println(m1.equals(m2));
      System.out.println(m1.compareTo(m2));
      System.out.println(m2);
      m1.add(m2);
      System.out.println(m1);
   }
}
