import java.util.Arrays;

public class DemoArray1 {
  public static void main(String[] args) {
   // Problem: Store/ Read a series of same type of data
   int x = 3;
   int y = 7;
   int a = 10;

   // ages [8,1, 10, 50]
   // Data structure - read/write data in a location (array)

   // ! 1.Create an array
   int[] arr = new int[4]; // created 4 spaces for int numbers
   // ! 2. Place numbers into the array
   // [0] -> index, starting from 0, length - 1 is the last index
   arr[0] = 8;
   arr[1] = 1;
   arr[2] = 10;
   arr[3] = 50;

   System.out.println(arr.length); //4

   // replace 100 into the second position of the array
   // ! 3. Modify element in array
   arr[1] = 100;

   // ! 4. Print all elements in the array
   System.out.println(arr); // [I@54bedef2 Object Reference
   System.out.println(Arrays.toString(arr));

   // double array, length 6
   double[] arr1 = new double[6];
   arr1[0] = 1.0;
   arr1[1] = 12.0;
   arr1[2] = 14.0;
   arr1[3] = 100.5;
   arr1[4] = 1000.6;
   arr1[5] = -999.999;
System.out.println(arr1.length); 

// String array, names, length 5
String[] arr2 = new String[5];
arr2[0] = "John";
arr2[1] = "Mary";
arr2[2] = "May";
arr2[3] = "Ann";
arr2[4] = "Paul";
System.out.println(Arrays.toString(arr2));

// Wrong code:
// arr3[-1] = "Peter"

System.out.println(arr2[4]); 

System.out.println(Arrays.toString(arr2).length() -1);


  }
}
