public class TwoDArray {
    public static void main(String[] args){
        /*
        * 2D Array:
        *   - an array where each elements is an array
        *   - Useful for storing a matrix of data
        * */

        String[] fruits = {"apple","banana", "orange"};
        String[] vegetables = {"potato", "tomato", "carrot"};
        String[] meats = {"chicken", "beef", "lamb", "fish"};

        String[][] groceries = {
                fruits, vegetables, meats
        };

        for(String[] foods : groceries){
//            System.out.println(foods);
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();

        }
    }
}
