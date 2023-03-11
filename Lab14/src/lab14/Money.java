package lab14;

public class Money {
    int dollars;
    int cents;
   
   public Money () {
      this. dollars = 0;
      this.cents = 0;
   }
   
   public Money (int dollars, int cents) {
      this.dollars = dollars;
      this.cents = cents;
      adjustMoney();
   }
   
   public int getCents () {
      return cents;
   }
   public int getDollars () {
      return dollars;
   }
   
   private void adjustMoney() {
      if (cents >= 100) {
         dollars += cents/100;
         cents = cents%100;
      }
   }
   
   public String toString() {
//      String centsString =  "0"+ cents;
//      return "$ " + dollars + "." + centsString.substring(centsString.length() - 2) ;
      return "$ " + dollars + "." + (cents < 10 ? ("0" + cents) : cents) ;
   }
   
   public boolean equals (Object other) {
      // other object does not to be null and this class and other class must equal and this and other dollar equals and this cents and other cents equal
      return other != null && this.getClass() == other.getClass() && dollars == ((Money)other).dollars && cents == ((Money) other).cents;
   }
   
   public int compareTo(Money other) {
      if (dollars == other.dollars) {
         if (cents == other.cents) {
            return 0;
         } else {
            return cents - other.cents;
         }
      } else {
         return dollars - other.dollars;
      }
   }
   

   public void add(Money other) {
      dollars += other.getDollars();
      cents += other.getCents();
      adjustMoney();
   }
   
   

}
