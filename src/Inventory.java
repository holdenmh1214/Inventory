import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by holdenhughes on 10/12/15.
 */
public class Inventory {

    static InvItem createItem(String category){
        if (category.equals("Hardware")) {
            return new Hardware();
        } else if (category.equals("Lumber")) {
            return new Lumber();
        } else if (category.equals("Tools")) {
            return new Tools();
        } else if (category.equals("Plumbing")) {
            return new Plumbing();
        } else if (category.equals("Electrical")) {
            return new Electrical();
        } else {
            System.out.println("Invalid category");
            System.out.println("Exiting system");
            System.exit(0);
            return null;
        }

    }

    public static void main(String[] args) {
        ArrayList<InvItem> items = new ArrayList();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int itemNum = 1;
            for (InvItem item : items) {

                System.out.println(String.format("[%d] %s (%d) %s", itemNum , item.name , item.qty , item.category));
                itemNum++;
            }


            System.out.println("Options"); //Selection choices
            System.out.println("[1] Add Item");
            System.out.println("[2] Remove Item");
            System.out.println("[3] Adjust Quantity");
            System.out.println("[4] Exit System;");

            String option = scanner.nextLine();
            int optionNum = Integer.valueOf(option);

            if (optionNum >3 || optionNum<1) { //Checking to confirm user input correct option
                System.out.println("Invalid option");
                System.out.println("Exiting system");
                System.exit(0);

            } else if (optionNum == 1) {
                System.out.println("Type item name");
                String itemName = scanner.nextLine(); //Item name is filled
                System.out.println("Type a qty");
                String itemQty = scanner.nextLine();
                int itemq = Integer.valueOf(itemQty);//Qty is filled
                System.out.println("Type category");
                String category = scanner.nextLine();
                InvItem item = createItem(category); //calling method to populate category, also checks for valid category
                item.name = itemName; //populating field with name
                item.qty = itemq; //populating field with qty
                items.add(item);

            }else if(optionNum ==2) {
                System.out.println("Which item number would you like to remove?");
                String select = scanner.nextLine();
                int selectNum = Integer.valueOf(select);
                InvItem item = items.remove(selectNum - 1);

            }else if(optionNum == 3){
                System.out.println("Which item qty would you like to adjust?");
                System.out.println("Select item number");
                String itemNumber = scanner.nextLine();
                int selectNum = Integer.valueOf(itemNumber);
                InvItem item = items.get(selectNum -1);

                System.out.println("What adjustment would you like to make for " +item.name);
                String newQty = scanner.nextLine();
                int newQ = Integer.valueOf(newQty);
                item.qty = newQ;

            } else if(optionNum == 4) {
                System.out.println("Exiting system");
                System.exit(0);
            }
        }
    }
}
