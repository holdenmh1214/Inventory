import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by holdenhughes on 10/12/15.
 */
public class Inventory {
    public static void main(String[] args){
        ArrayList<InvItem> items = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int itemNum = 1;
            System.out.println(itemNum + " " + "[" + items);
            itemNum++;
        }

        System.out.println("Options");
        System.out.println("[1] Add Item");
        System.out.println("[2] Remove Item");
        System.out.println("[3] Adjust Quantity");

    }
}
