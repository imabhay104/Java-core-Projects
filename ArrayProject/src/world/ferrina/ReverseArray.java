package world.ferrina;

import java.util.Arrays;

public class ReverseArray {

     public int[] reverse(int[] array)
    {
        Arrays.sort(array);
        int temp=0,n=array.length;
        for (int i = 0; i <n/2 ; i++) {
               temp=array[i];
               array[i]=array[n-1-i];
               array[n-1-i]=temp;
        }
        return array;
    }
}
