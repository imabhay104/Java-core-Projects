package world.ferrina;

public class Main {
    public static void main(String[] args) {
//        int[] array=new int[1];
//        array[0]=1;
//        System.out.println(array[0]);
//        String[] s={"Abhay","Pradip","Sjhide"};
//        System.out.println(s[0]);
//        double[] s1={1,2,3};
//        System.out.println(s1[0]);

//        Object object[]= new Object[2];
//        object[0]=new int[]{1,2,3,4,5};
//        object[1]=new StringBuilder("Abhay");
//        for (Object element: object)
//        {   if (element instanceof StringBuilder)
//        {
//            System.out.println(element.toString());
//        }else  System.out.println(element.toString());object[1].
//    }

//        int[] array={1,2,54,0,9};
//        int [] array1=Arrays.copyOf(array,array.length);
//        Arrays.sort(array1);
//        int index=Arrays.binarySearch(array1,9);
//        System.out.print(Arrays.toString(array1));
//        System.out.print("\n"+index);
//        Random random=new Random();
//        int[] array=new int[6];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(100);  // Generate random number (0 to 99)
//        }
//        Arrays.sort(array);
//        System.out.println("before:"+Arrays.toString(array));
//        int temp=0;
//        for (int i = 0; i < array.length/2; i++) {
//            temp=array[i];
//            array[i] = array[array.length-1-i];
//            array[array.length-1-i]=temp;// Generate random number (0 to 99)
//        }
//        System.out.println("After:"+Arrays.toString(array));
//        int array[];
//        array=SortedArray.getIntegers(5);
//
//        SortedArray.printArray(array);
//        array=SortedArray.sortIntegers(array);
//        SortedArray.printArray(array);
//        Object array=MinElement.readIntegers();
//        if (array instanceof int[])
//        System.out.println(MinElement.findMin((int[])array));
//        else ;
//        int[] array={3,4,33,534,535,757,9877,5454};
//        ReverseArray r=new ReverseArray();
//        System.out.println(Arrays.toString(r.reverse(array)));
//
//        int[][] array1 = new int[4][4];
//        for(int[] element: array1)
//        {
//            System.out.println(Arrays.toString(element));
//        }
//        System.out.println("##".repeat(20));
//
//        for(int i=0;i< array1.length;i++)
//        {
//            for (int j = 0; j < array1.length; j++) {
//                array1[i][j]=i*10+j+1;
//            }
//            System.out.println("\n");
//        }
//
//System.out.println(Arrays.deepToString(array1));
//
//        Object[] arraynew = new Object[3];
//        arraynew[0]= new int[]{10,20};
//        System.out.println(Arrays.deepToString(arraynew));
        int[] array={1,2,3};
        for (int k : array) {
            for (int i : array) {
                System.out.printf("(%d,%d)", k, i);
            }
        }

    }}
