import java.util.Scanner;

public class SearchElementInArrayString {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String[] fruits = {"apple", "orange", "banana", "kiwi", "lemon", "cherry"};
        boolean isFound = false;
        String target;

        System.out.println("What fruit would you like to search? ");
        target = scan.nextLine();


        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element " + target +" found at index " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in array");
        }


        scan.close();
    }
}
