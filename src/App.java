
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int [] myIntegers = getIntegers(5);
        // int []sorted = sort(myIntegers);
        printArray(sort(myIntegers));

        printArray(myIntegers);
        System.out.println(sort(myIntegers));
    }
    //inputing an array

    public static int [] getIntegers(int capacity){
        Scanner input = new Scanner(System.in);
        int [] array = new int [capacity];
        System.out.println("enter" + capacity +"integer value");
        for(int i = 0;i<array.length;i++)
        {
            array[i] = input.nextInt();

        }
        return array;
    }

    //printing an array 

    public static void printArray(int[] array)
    {
        for(int i = 0;i < array.length;i++)
        {
            System.out.println("Element "+ i +" Contents "+array[i]);
        }
    }

    //copying the array and sorting
    public static int [] sort(int [] array)
    {
        int [] sortedArray = new int[array.length];
        for(int i=0;i<array.length;i++){
        // copy the content 
            sortedArray[i] = array[i];
        }

        //sorting the array
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1])
                {
                    // swapping is taking place here
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+1] = temp;
                flag = true;
                }
            }
        }
        return sortedArray;
    }
}
