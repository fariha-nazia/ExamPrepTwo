public class varArgsMethodForAverage {
    public static void main(String[] args){

        System.out.println(average());

    }


    /*
    * we are creating a:
    *   - static method
    *   - with double data type
    *   - named average
    * */

    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }
        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;

    }
}
