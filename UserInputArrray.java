
import java.util.Scanner;
public class UserInputArrray {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("What num of food do u want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i=0;i<foods.length;i++){
            System.out.print("Entrer a food: ");
            foods[i] = scanner.nextLine();
        }
        for(String food : foods){
            System.out.println(food);
            
        }
        scanner.close();



        
    }
}
