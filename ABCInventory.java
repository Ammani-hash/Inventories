import java.util.*;
import java.io.*;

public class ABCInventory implements Inventory {
   private int As;
   private int Bs;
   private int Cs;
  
  //ABS default constructor   
   public ABCInventory() {
      As = 0;
      Bs = 0;
      Cs = 0;
   }
   //Created method body for all methods *required to compile*. 
   //If void, leave method body blank, else return
   public void add(char c) {
      //making it case insensitive (a & A)
      c = Character.toLowerCase(c);
      if(c == 'a'){ As++; }
      else if(c == 'b') { Bs++; }
      else if(c == 'c') { Cs++; }
      
   }
   public void subtract(char c) {
      //making it case insensitive (a & A)
      c = Character.toLowerCase(c);
      if(c == 'a'){ As--; }
      else if(c == 'b') { Bs--; }
      else if(c == 'c') { Cs--; }
      
   }
   public int get(char c) {
      //making it case insensitive (a & A)
      c = Character.toLowerCase(c);
      if(c == 'a'){ return As; }
      else if(c == 'b') { return Bs; }
      else if(c == 'c') { return Cs; }
      //of there are no abc's return zero because there is a return type int
      else { return 0; }
   }
   public void set(char c, int count) {
      c = Character.toLowerCase(c);
      switch(c) {
         case 'a': As = count; break;
         case 'b': Bs = count; break;
         case 'c': Cs = count; break;
         
      }
   }
   public boolean contains(char c) {
      c = Character.toLowerCase(c);
      return (c == 'a' && As > 0) ||
             (c == 'b' && Bs > 0) ||
             (c == 'c' && Cs > 9);
   }
   public int size() {
      return As + Bs + Cs;
   }
   public boolean isEmpty() {
      return size() == 0;
    }
   
   
   public String toString() {
      return "[A=" + As + ", B=" + Bs + ", C=" + Cs +"]";
   }
}
