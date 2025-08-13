public class DemoOperator {
  public static void main(String[] args) {
    // +=, -=, *=, /=
    int x = 3;
    x += 4; // ! x = x + 4
    System.out.println(x); // 7

    int y = 9;
    y -= 8; // ! same as y = y -8
    System.out.println(y); //1

    int g = 8;
    g *= 4; // ! same as g = g * 4
    System.out.println(g);

    int p = 10;
    p /=3; // ! same as p = p / 3
    System.out.println(p); // 3

    // + 1
    int u = 1;
    u++;
    System.out.println(u); // 2
    u = u + 1;
    u += 1;
    System.out.println(u); // 4

    // - 1
    int h = 5;
    h--;
    System.out.println(h); // 4
    h = h - 1;
    h -= 1;
    System.out.println(h); // 2



    // Comparsion Operator >, <, >=, <=, !=, ==
    int age = 70;
    // !Approach 1
    boolean isElderly = age > 65;
    // ! Approach 2:
    if (age > 65) {
      isElderly = true;
    }
    
    char ch = 'A';
    boolean isCharEqualsToA = ch == 65;
    System.out.println(isCharEqualsToA); // true

    char grade = 'R'; // A, B, C, D, E, F
    // Approach 1: or
    boolean isGradeValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade ==  'E' || grade == 'F';
    // Approach 2: if
    isGradeValid = false;
    if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade ==  'E' || grade == 'F') {
      isGradeValid = true;
    }
  
    // Approach 3: ASCII value range check
    isGradeValid = grade >= 'A' && grade <= 'F';
    // ! because we are using comparsion operator (>=, <=, >, <),
    // ! convert char valse to int value before comparsion.
    
    // Odd / Even number
    int number = 23;
    boolean isOdd = number % 2 == 1;
    if (isOdd) {
    System.out.println("hello");
    }

    if (number % 2 == 1) {
      System.out.println("hello");
    }

    int a = 7;
    int b = 12;
    int c = 9;
    int d = 10;
    int max = a;
    if (a > b) {
      max = a;
    } else {
      max = b;
    }
    
    if (c > max) {
      max = c;
    }
    if (d > max) {
      max = d;
    }
    
    System.out.println("max value=" + max); // max value=9


    // leap year
    // divided by 4 -> Leap (i.e. 2024)
    // divided by 100 -> Not a leap year (i.e. 2100, 1900)
    // divided by 400 -> Leap Year (i.e. 2000)
    // Cannot divided by 4 -> Not a leap year (i.e. 2025)

    int year = 2000;
    boolean isLeapYear = false;
    if (isLeapYear = year % 4 == 0 || year % 400 == 0){
      isLeapYear = true;
    } else {
     isLeapYear = false;
    }
  if (year % 100 == 0 && year % 400 == 0) {
    isLeapYear = false;
  }
  if (year % 100 == 0) {
    isLeapYear = false;
    
  }
  

    if (isLeapYear == true) {
      System.out.println(year + " is a Leap Year");
    } else {
    System.out.println(year + " is not a Leap Year");
    }
  }
}

    
 //   if (year % 4 ==0) {
 //     if (year % 100 ==0) {
 //       if (year % 400 ==0) {
//isLeapYear = true;
  //      } else {
  //        isLeapYear = false;
 //       }
 //     } else { // 2024}
 //     isLeapYear = true;
 //     }
 //   } else {
 //     isLeapYear = false;
 //   }
 //   System.out.println(year + " is a Leap Year");
 // }
//}

// 簡化例子
//isLeapYear = year % 4 == 0
//&& (year % 100 == 0 && year % 400 == 0 || year % 100 != 0);
//System.out.println(year + " is a Leap Year")

