public class DemoConditional {
  public static void main(String[] args) {
    // if else -> control program flow
    int x = 10;
    if (x > 12) {
      System.out.println("hello");
    } else { // x <=12
      System.out.println("goodbye");
    }

    // declare y
    // declare counter
    // check if double value y > 999.5, counter + 1, otherwise counter + 2
    // print out counter

     double y = 1000;
     int counter = 0;
  if (y > 999.5) {
    counter = counter + 1;
    } else { 
    counter = counter + 2;
    }
    System.out.println(counter); //1

    // and or
    int a =10;
    int b = 90;

    // ! && and
    if (a > 5 && b > 80) {
      System.out.println("do something..."); // print
      } else {
      System.out.println("do something else...");
      }

      // ! || or
      // && > ||
      // a > 9 && b > 90 -> true && false -> false
      // b % 2 == 0 -> true
      // finally: false || true -> true
      if (a > 9 && b > 90 || b % 2 == 0) {
        System.out.println("correct"); //print
      } else {
        System.out.println("incorrect");
      }

      
      // char gender = 'F';
      // char smoker = 'Y';
      int age = 66;
      boolean isMale = false;
      boolean isSmoker = true;
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
      }  
        System.out.println(premium + "+0% premium");
      }

      if (isSmoker == true) {
        System.out.println(premium + "+15% premium");
      } else {
        System.out.println(premium + "+0% premium");
      }

      if (age > 50 && isMale == true) {
        System.out.println(premium + "+8% premium");
      } else {
        System.out.println(premium + "+0% premium");
      }



      // if-else if-else
      int score = 95;
      char grade = ' ';
      // A: 90 or above
      // B: 80 - 89
      // C: 70 - 79
      // F: < 70
      if (score >= 90) {
        grade = 'A';
      } else if (score >= 80) {
        grade = 'B';
      } else if (score >= 70) {
        grade = 'C';
      } else {
        grade = 'F';
      }
      System.out.println("Grade" + grade); //B


      boolean isElderly = false;
      isMale = true;
      if (isElderly) {
      } else if (isMale) { //Not an elderly
      }

      // ! Better approach for maintainence
      if (isElderly) {
      } else { // Not an elderly
        if (isMale) {
      }
      }
// ! 1. if-else, if-else if-else, if, if-else if
// ! 2. switch

score = 75;
// ! 1. "case" can check equals value ONLY, NO range checking
// ! 2. No AND checking (Single condition)
// Bad Example for switch
switch(score) {
case 91:
grade = 'A';
case 92:
grade = 'A';
case 93:
grade = 'A';
//...
}
      
// Good Example:
// R G B
char color = 'R';
// ! 3. By default, run all code blocks after meet the condition
// ! 4. You have to "break" it manually to exit the switch
switch (color) {
  case 'R':
  System.out.println("It is red");
  break;
  case 'G':
  System.out.println("It is green.");
  break;
  case 'B':
  System.out.println("It is blue.");
  break;

  // Conclusion:
  // ! 1. Finite values 先會考慮用 switch
  // ! 2. Different purpose for different case
}




      }
}
    

  

  



  }
}  
 

    
  
