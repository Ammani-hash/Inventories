import java.util.*;
import java.io.*;

public class InventoryLog{
   private List<Character> log;

   public InventoryLog() {
        letters = new ArrayList<>();
    }

   public void add(char c) {
      if(Character.isLetter(c)) {
         c = Character.toLowerCase(c);
         letters[c - 'a']++;
      }
   }
   public void add(char c) {
      grades.add(grade);
    }
   
//   public void subtract(char c) {
      //similar to add method
//       if(Character.isLetter(c)) {
//          c = Character.toLowerCase(c);
//          //decrement instead of increment
//          letters[c - 'a']--;
//       }
      
      public void subtract(char c) {
        //Uses removeIf() method to remove elements that match the grade that is passed. Had to look this up
        boolean found = grades.removeIf(a -> a == grade);
    }

   }
   /////////////////////////////////////////////////////////////////////
   //do not edit//
   public  get(char c) {
      if(Character.isLetter(c)) {
         c = Character.toLowerCase(c);
         return letters[c - 'a'];
      }
      return 0;
   }
   public void set(char c, int count) {
      if(Character.isLetter(c)) {
         c = Character.toLowerCase(c);
         
         //checks if count (number of repititions) is greater than zero
         //if that is the case, it sets the array index to the value count
         if(count >= 0) {
            letters[c - 'a'] = count;
         }
      }
   }
   public boolean contains(char c) {
      if(Character.isLetter(c)) {
         return letters[c - 'a'] != 0;
      }
      return false;
   }
   public int size() {
      int size = 0;
      for (int i : letters) {
         size += i;
      }
      return size;
   }
   public boolean isEmpty() {
      return size() == 0;
   }

   public String toString() {
      StringBuilder toReturn = new StringBuilder("[");
      for(int i = 0; i < letters.length; i++) {
         for(int count = 0; count < letters[i]; count++) {
            toReturn.append((char)('a' + i));
         }
      }
      return toReturn.append("]").toString();      
   }
}
