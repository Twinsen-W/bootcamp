import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigdecimal {
  public static void main (String[] args) {
    double result = 0.1 + 0.2;
    System.out.println(result); // 0.300000000004
    if (result == 3.0) {
      System.out.println("Result" !=3.0);

    }
    // Solution: BigDecimal
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3.doubleValue()); // 0.3

    BigDecimal bd4 = BigDecimal.valueOf(0.1);
    BigDecimal bd5 = BigDecimal.valueOf(0.2);
    BigDecimal bd6 = bd4.add(bd5);
    System.out.println(bd6.doubleValue()); // 0.3

    // + add()
    BigDecimal bd7 = BigDecimal.valueOf(0.1);
    BigDecimal bd8 = BigDecimal.valueOf(0.2);
    BigDecimal bd9 = bd7.subtract(bd8);
    System.out.println(bd9);

    // - subtract()
System.out.println(bd4.subtract(bd5).doubleValue()); // -0.1

    // * multiply()
    System.out.println(0.1 * 0.2); // 0.020000000000004
    System.out.println(bd4.multiply(bd5).doubleValue()); // 0.02

    // / divide(), not-terminating decimal, rounding
System.out.println(0.3 / 0.1); // 2.999999999996
System.out.println(BigDecimal.valueOf(0.3).divide(Bigdecimal.valueOf(0.1))); //3


// 10 /3 
// HALF_UP -> 0.5 or above, round up
// HALF_DOWN -> 0.5 or below, round down
System.out.println(BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP)); // 3.33


  }
}
