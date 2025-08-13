public class InsuranceCheckExample2 {
  public static void main(String[] args) {


    // Female + Smoker -> 25%
    // Female + non-Smoker -> 10%
    // Male + 50 + Smoker -> 15%
    // Male + 51 + Smoker -> 23%
    // Male+ 50 + non-Smoker -> 0%
    // Male +51 + non-Smoker -> 8%

    // Program: run fast? readability? development time?

    int age = 66;
    boolean isMale = true;
    boolean isSmoker = true;
    double premium = 100;
    double extraPremPct = 0.0;

    if (isMale) { // ! same as "if (isMale == true)"
      if (age > 50) {
        extraPremPct = extraPremPct + 8.0;  // 可寫成 extraPremPct += 8.0;
      }
      } else { //Female 
      extraPremPct = extraPremPct + 10.0; // 可寫成 extraPremPct += 10.0;
    }
            if (isSmoker == true) {
        extraPremPct = extraPremPct + 15.0; // 可寫成 extraPremPct += 15.0;

      }
      

      premium = premium * (100 + extraPremPct) / 100.0;
      System.out.println(premium);
    }
  }