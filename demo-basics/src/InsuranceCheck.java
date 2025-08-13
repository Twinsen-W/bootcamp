public class InsuranceCheck {
  public static void main(String[] args) {

 int age = 66;
      boolean isMale = false;
      boolean isSmoker = false;
      double premium = 0.0;

      //  Condition:
      // 1) Female -> 10% extra premium
      // 2) Smoker -> 15% extra premium
      // 3) Age > 50 and Male -> 8% extra premium

   

      if (isMale == false && isSmoker == true){
        premium = premium + 25;
        System.out.println("+" + premium + "%");
      } else {
      if (isMale == false && isSmoker == false) {
        premium = premium + 10;
        System.out.println("+" + premium + "%");

        if (isMale == true && isSmoker == true){
        premium = premium + 25;
        System.out.println("+" + premium + "%");


}
}
  
}
}