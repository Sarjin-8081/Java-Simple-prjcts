
import java.util.Scanner;

public class SearchThroughArray{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = {1,2,3,4,5,6,7};
        String[] fruits = {"apple","orrange","banana"};
        boolean isFound = false;
        String target;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();
        
        

        for(int i = 0 ; i< fruits.length ; i++){
            if(fruits[i].equals(target)){
                System.out.println("elemnt found at index: " + i);
                isFound=true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found is the array");
        }

    }
}
