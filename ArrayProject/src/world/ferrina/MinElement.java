package world.ferrina;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {


    public static int[] readIntegers()
    {

        Scanner scanner = new Scanner(System.in);
         String temp=scanner.nextLine();
         String[] array=temp.split(",");
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i].trim());  // Trim whitespace and parse as an integer
        }
         return intArray;
    }
    public  static int findMin(int[] array)
    {

        Arrays.sort(array);
        return array[0];
    }

}
