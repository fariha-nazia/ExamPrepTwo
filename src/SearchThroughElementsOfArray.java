public class SearchThroughElementsOfArray {
    public static void main(String[] args){

        /*
        * Search element in array
        * */

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int target = 10;
        boolean isFound = false;

        for( int i = 0; i < numbers.length; i++ ){
            if(target == numbers[i]){
                System.out.println("Element " + target + " is found at index " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array");
        }
    }
}
