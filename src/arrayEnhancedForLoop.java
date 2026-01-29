public class arrayEnhancedForLoop {
    public static void main (String[] args){
        /*
        * Enhanced For Loop
        *  - Enhanced For Loop will cycle once for each element in an Array
        * */

//        How to create a Enhanced For Loop
        /*
        * for (inside the bracket the datatype)
        * a variable to store the value of elements
        * then name of the array */

        String[] fruits = {"apple", "banana", "orange",  "kiwi", "lemon", "cherry"};

//        this means in the string for every fruit from fruits do something
        for(String fruit : fruits){
            System.out.print(fruit + ", ");
        }
    }
}
