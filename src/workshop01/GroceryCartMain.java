package workshop01;

import java.io.Console;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class GroceryCartMain{
    public static void main(String[] args) {
        
        Console cons = System.console();

        List<String> shoppingCart = new ArrayList<>();

        boolean status = false;

        while (!status){
            String cmd = cons.readLine(">cmd: ");

            String[] input = cmd.split(" ");

            switch (input[0].toLowerCase()){
                case "list":
                    if (shoppingCart.isEmpty()){
                        System.out.println("Your cart is empty");
                    } else {
                        int count = 0;
                        for (String item:shoppingCart){
                            count += 1;
                            System.out.printf("%d. %s\n", count, item);
                        }
                    }
                    break;
                case "add":
                    for (int i = 1; i < input.length; i++){
                        shoppingCart.add(input[i]);
                        System.out.printf("%s added to the cart\n", input[i]);
                    }
                    break;
                case "delete":
                    int index = Integer.valueOf(input[1]);
                    if (index > shoppingCart.size()){
                        System.out.println("incorrect item index");
                    } else {
                        shoppingCart.remove(index);
                    }
                    break;
                case "break":
                    System.exit(0);
                    break;
            }
        }

    }
}









/* Write a console-based shopping cart that allows users to ADD, REMOVE and LIST the contents.
 * LIST - list the content of the cart. if empty, print "Your cart is empty."
 *         if not empty, print numbered content.
 * ADD - add one or more item to the cart, seperated by commas
 *       print "<item> added to the cart"
 * DELETE - delete an item based on item's index. if incorrect index provided, print "incorrect item index"
 */