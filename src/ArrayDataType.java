public class ArrayDataType {
    public static void main (String[] args){

        /*
        * Array:
        *   - It is kind of variable which can store more than one value
        * */

        /*
        * THE WAY OF WRITING AN ARRAY
        * */

        String[] fruits = {"apple", "orange", "banana", "kiwi", "lemon", "cherry"};
        System.out.println(fruits[0]);
//        System.out.println(fruits[1]);

//        change value of index
        fruits[0] = "mango";
        System.out.println(fruits[0]);


//      Find length of array
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

//        How to print all the elements in an array
        for (int i = 0; i <fruits.length; i++){
//            System.out.println(fruits[i]);
            System.out.print(fruits[i] + " ");
        }


    }
}
