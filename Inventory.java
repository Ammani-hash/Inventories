public interface Inventory {
   public void add(char c);
   public void subtract(char c);
   public int get(char c);
   public void set(char c, int count);
   public boolean contains(char c);
   public int size();
   public boolean isEmpty();
}
