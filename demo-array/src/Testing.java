public class Testing {
  public static void main(String[] args) {
    // Print first ten numbers, which fulfill the followings criteria:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. > 0
    for (int i = 0; i < 100; i++) {
      // code here ...
      if (i % 3 == 0 && i % 2 == 0 && i > 0) {
        System.out.println(i);
      }
    }
  }
}