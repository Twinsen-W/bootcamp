public class DemoString {
  public static void main(String[] args)  {
    // Data Types: 8 Primitives, Class (String)
    String s1 = "hello";
    System.out.println(s1); // hello

    //length
    System.out.println(s1.length()); // 5
    int length =s1.length();

    // equals()
    if (s1.equals("HELLO")) { // ! Java: case sensitive
      System.out.println("equals");
    } else {
      System.out.println("Not equals"); // print

      boolean isEqualsToXXX = s1.equals("HELLO");
      System.out.println(isEqualsToXXX);
  }


  // charAt(int index)
  System.out.println(s1.charAt(0)); // h, index = 0 means the first character of the string
  // print the last character of a string
  int lastIndexOfString = s1.length() - 1;
  char lastChar = s1.charAt(lastIndexOfString);
    System.out.println(lastChar);
  }
}

// ! index -> out of range (system error)
// System.out.println(s1.charAt(-1));  最多只可寫到 -1
// System.out.println(s1.charAt(s1.length()));  必死

// ! 4. contains()
System.out.println("apple".contains("ap")); //true
System.out.println("apple".contains("pa")); //false
System.out.println("apple".contains("AP")); //false
System.out.println("apple".contains("apple")); //true
System.out.println("apple".contains("apple2")); //false

// ! 5. indexOf()
// input: char, output, output: index
System.out.println("halo".indexOf('l')); // 2, index starting from 0
System.out.println("hello".indexOf('l')); // 2, the index of first character
System.out.println("halo".indexOf('b')) // -1
System.out.println("hello world".indexOf("llo")); //2, similar to contains()

// ! lastindexOf()

// ! 6. equals/ equalsIgnoreCase
System.out.println("apple".equals("apple")); //true
System.out.println("apple".equals("Apple")); //false
System.out.println("apple".equalsIgnoreCase("APPLE")); //true
System.out.println("apple".equalsIgnoreCase("appl")); // false

// ! 7. toUpperCase/ toLowerCase
System.out.println("apple".toUpperCase()); //APPLE
System.out.println("APPLE".toLowerCase()); //apple

// ! 8. startsWith/ endWith
System.out.println("apple".startsWith("a")); //true
System.out.println("apple".startsWith("app")); //true
System.out.println("apple".startsWith("A")); //false
System.out.println("apple".endsWith("el")); false

// check if a tring endswith le or LE
String s3 = "apple";

// Primitives. Class
// chain methods
System.out.println(s3.toUpperCase().endsWith("LE")); //true
System.out.println(s3.endsWith("le" || s3.endsWith("LE"))); //true

boolean result= s3.endsWith("le") || s3.endsWith("LE");
System.out.println(result); //false

// ! 9. concat
System.out.println("hello".concat("world")); helloworld
String s3 = "apple";

// ! Both String value and String variable can use methods
System.out.println(s3.concat("!!!"); apple!!!
System.out.println(s3); //apple

//chain method
System.out.println(s3.concat("banana").length()); // 11
System.out.println(s3.concat("lemon").equals("applelemon")); // true

// ! 10. replace()
String s4 = "banana";
String result2 = s4.replace('a', 'x');
System.out.println(s4); //banana
System.out.println(result2); //bxnxnx

System.out.println(s4.replace("an", "ijk")); // bijkijka
System.out.println(s4.replace("a", "")); 

// ! 11. isEmpty() / isBlank()
System.out.println("apple".isEmpty()); //false
System.out.println("".isEmpty()); //true

String s5 = null; // null value
String s6 = ""; // empty String

// ! System.out.println(s5.length()); length 個 null value非常危險,會出事!!
System.out.println(s6.length())); // 0
String s7 = "      ";
System.out.println(s7.length()); // 6
System.out.println(s7.isEmpty()); // false
System.out.println(s7.isBlank()); // true

String s8 = ""
System.out.println(s8.isEmpty()); // true
System.out.println(s8.isBlank()); // true
