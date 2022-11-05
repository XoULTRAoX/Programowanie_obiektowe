public class Item {

   String name;
   int quantity;

   public Item(String name, int quantity) {
       this.name = name;
       this.quantity = quantity;
   }

   public static void main(String[] args) {
       Iteam s_axe = new Item("Steel Axe", 14);
       Iteam ci_axe = new Item("Cast Iron Axe", 3);
       Iteam s_saw = new Item("Steel Saw", 21);
       System.out.println("Shop equipment");
       System.out.println("Name: "+s_axe.name+ " - Quantity: "+s_axe.quantity);
       System.out.println("Name: "+ci_axe.name+ " - Quantity: "+ci_axe.quantity);
       System.out.println("Name: "+s_saw.name+ " - Quantity: "+s_saw.quantity);
       
   }

}
