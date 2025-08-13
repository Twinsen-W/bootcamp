public class Testing {
  public static void main(String[] args) {

// break -> searching, exit earlier
// Search the name contain J character
String name = "John";
for (int i = 0; i < name.length(); i++) {
if (name.charAt(i) == 'J') {
System.out.println("Contain J character");
} else {
  System.out.println("Not contain J character");
}

  }
}
}
