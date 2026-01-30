public class variableArguments {
    public static void main(String[] args){
//        =========================================================

        /*
        * Variable Arguments / varargs:
        *   - allow a method to accept a varying number of arguments
        *   - making methods more flexible
        *   - no need for overloaded methods
        *   - java will pack the arguments into array
        *   - ... (ellipsis)
        *  */

        System.out.println(add(1,2,3,4,5));

//        =========================================================
    }

    /*
    * Methods are declared here
    * */

    static int add(int... numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;

    }
}
