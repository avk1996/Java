// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class BinerySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
        int key = -1;
        System.out.println("Size: "+array.length);
        System.out.println("Size/2: "+array.length/2);
        System.out.println("Key : "+key+", Found: "+binarySearch(array, key));
       
    }
    private static int binarySearch(int[] array, int key){
        Arrays.sort(array);
        int n = array.length;
        int low = 0;
        int mid = n/2;
        int high = n-1;
        do{
            System.out.println("Low: "+low+", mid: "+mid+", High: "+high);
            if(key > array[mid])
                low = mid + 1;
            else if(key < array[mid])
                high = mid - 1;
            else if(key == array[mid])
                return array[mid];
            mid = (high + low)/2;
        }while(high > low);
        return -1;
    }
}