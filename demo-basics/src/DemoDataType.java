import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DemoDataType {
  public static void main(String[] args) {
    // ! int, double, boolean, char, byte, short, long, float (Primitive原始類型) 8款
    // ! String

    String s1 = "hello          WORLD"; //hello WORLD -> String value
    System.out.println(s1);  // s1 -> String variable


    // variable naming convention -> camel case
    // Never: is_male, ismale
    boolean isMale = true;

    double age = 66;
    boolean isElderly = age > 65;
    System.out.println(isElderly);

    // ! char range: 0 - 6xxxx
    char gender = 'M';  
    System.out.println(gender);
    char ch = '體';
    char ch3 = '体';
    
    int chAscii = ch;
    System.out.println(chAscii); // 39636
    int ch3Ascii = ch3;
    System.out.println(ch3Ascii); // 20307
    // define char value -> use single quote ' '
    // char value has to be single character

    // byte, short, int and long
    byte age2 = 100;
    // byte: -128 to 127
    // short: -32,768 to 32,767
    // int: -2,147,483,648 to 2,147,483,647
    // long: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

    long l1 = 100;
    // Step 1: assign 100 int value into long type variable (OK)
    System.out.println(l1);

    byte b1 = 127;
    byte b2 = -128;

    short s3 = 32767;
    short s4 = -32768;

    int result = b1 + 7;
    // Step1: byte value + int value -> int value
    // Step2: assign int value into int variable
    System.out.println(result);

    int r1 = b1 + s3; //byte value + short value -> int + int -> int
    System.out.println(r1);

    //byte b10 = b1 + 1; // byte + int -> int
    // ! because byte + int -. int, so we cannot assign int value into byte variable

    int r2 = b1 + 1; // byte + int -> int + int -> int

    int i10 = 2_147_483_647;
    int i11 = i10 + 1;;
    System.out.println(i11);

    int i12 = 2_100_000_000 + 100_000_000; // overflow
    System.out.println(i12);  // -2094967296

    // by default, 7.84 is a double value
    // by default, 7 is a int value
    float width = 7.84f; // f -> float value
    System.out.println(width);
    long k = 10L; // L -> long value
    System.out.println(k); // 10
    double d10 = 9.89; // d -> double value
    System.out.println(d10); //9.89

    // ! because 7.77 is double value, and we cannot assign double value to float variable
    // ! double > float
    //float f1 = 7.77;

    float length = 5.3f;
    float area = length * width;
    System.out.println(area);

    // float area2 = length * 7.84;
    //! float * double -> double value -> float variable (NOT OK)

    //ASCII Code
    // a,b,c,d...1,2,3,4...!@#$%...
    char letter = 97; // we can assign char value or ASCII code

    //char letter2 = letter +1;
    // Step 1: char value + int value -> int -> cannot assign int value to char variable

    int letter2 = letter + 1; // char + int -> int
    System.out.println(letter2); // 98


    // solution
    char letter3 = (char) (letter + 1); // downcast (int -> char)
    System.out.println(letter3); // b




  











    long l2 = 100L;
    // assign 100L long value into long type variable (OK)
    System.out.println(l2);


    int asciiForZero = 48;
    char letter4 = (char) asciiForZero;
    System.out.println(letter4); // 0


    char letterForZ = 'A' + 25; // ! explicit char value ( no risk)
    System.out.println(letterForZ);

    int distance = 2;
    char letterForC = (char) ('A' + distance); // ! explicit char value + int variable ( risky)
    System.out.println(letterForC); // C









  }    

  }

