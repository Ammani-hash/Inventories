import java.util.*;
import java.io.*;

public class InventoryEngine {

   public static void main(String [] args) {
      //Constructing inventory
      Inventory inv = new LetterInventory();
      testInventory(inv);
      //populate(inv, "data/alphabet.txt");
      System.out.println(inv + " size=" + inv.size());
   }
   
   public static void populate(Inventory inv, String fileName) {
      try{
         Scanner file = new Scanner(new File(fileName)); 
         while (file.hasNextLine()) {
            String line = file.nextLine();
            for(int i = 0; i < line.length(); i++) {
               inv.add(line.charAt(i));
            }
         }  
      } catch(FileNotFoundException e) {
         System.out.println("Can't populate " + fileName);
      }
      
   }
   
   public static void testInventory(Inventory inv) {
      inv.add('a');
      inv.subtract('A');
      inv.add('b');
      inv.set('c', 25);
      System.out.println("count of Bs = " + inv.get('b'));
      System.out.println("Are there Cs? " + inv.contains('c'));
      System.out.println("Are there any Gs? " +inv.contains('g'));
      System.out.println("Is the inventory empty? " + inv.isEmpty());
   }
}