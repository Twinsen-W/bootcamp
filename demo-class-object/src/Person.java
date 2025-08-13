// ! Object Oriented Programming (OOP), C++, C#, etc. 物件導向語言

// Blueprint
// 我哋要描述嘅世界嘅 Person,佢哋淨係得 Name 和 Age

// ! (Wrong Concept in Java) 因為 Person 特徵太少 (Age and Name ONLY), 呢個世界嘅 Person 好容易重覆 Name and Age
// ! (Correct) 因為我覺得/ 我想形容嘅世界嘅 Person, Name and Age 係唔會重覆, 我先會咁 design 個 class。

import java.math.BigDecimal;

public class Person {
    // Attribute ()
    private int age;
    private String name;

    // Setter
    // ! p1.setAge(17), put 17 into "this" Object (p1)
    public void setAge(int age) {
       this.age =  age;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        // "new" -> create object
        // "Person" -> class name
        // "()" -> constructor
        // ! "p1" -> this is a name for you to call the object in memory
       Person p1 =  new Person();
       BigDecimal bd1 = new BigDecimal ("3.4");
       // Person p2 = new BigDecimal (7.3);

       new Person(); // create an person object in memory, but without a name for later use.

       Person p3 = new Person();
       p1.setAge(17);

       p1.getAge();

       p1.setName("John");

       p1.getName();

       System.out.println(p1.getAge()); //17
       System.out.println(p1.getName());
    }
}
