package world.ferrina;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    // write code here

    public static int[] getIntegers(int length)
    {
        int[] array=new int[length];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<length ;i++)
        {
            array[i]=Integer.parseInt(scanner.nextLine());

        }
        return array;
    }
    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d\n",i,array[i]);
        }
    }
    public static int[] sortIntegers(int[] array)
    {
        Arrays.sort(array);
        int temp,n= array.length;
        for (int i = 0; i < n/2; i++)
        {
            temp=array[i];
            array[i]=array[n-1-i];
            array[n-1-i]=temp;
        }
        return array;

    }

}

