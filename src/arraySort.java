import java.util.Arrays;

public class arraySort {
    public static void main (String[] args){

//        Declaring the array
        String[] fruits = {"apple", "banana", "orange",  "kiwi", "lemon", "cherry"};

//        How to sort
        /*
        * step 1: import the Array util
        * call the class Arrays
        * and add sort() - this is built-in method
        * pass our array in the method
        * */
        Arrays.sort(fruits);

//        How to fill array with given value
        Arrays.fill(fruits, "cake");

//        Enhanced for loop
        for (String fruit : fruits){
            System.out.println(fruit);
        }



    }
}
