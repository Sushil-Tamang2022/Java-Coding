package Generics;

public class GenericsExample {
   public static void main(String[] args) {

// Generics = A concept where you can write a class, interface, or method
//                     that is compatible with different data types.
//                    <T> type parameter (placeholder that gets replaced with a real type)
//                    <String> type argument (specifies the type)

       Box<String> box = new Box<>();
       box.setItem("banana");
       System.out.println(box.getItem());

       Product<String, Double> product1 = new Product<>("apple", 0.50);
       Product<String, Integer> product2 = new Product<>("ticket", 15);
   }
}
class Box<T>{

   T item;

   public void setItem(T item){
       this.item = item;
   }

   public T getItem(){
       return item;
   }
}
class Product<T, U> {

   T item;
   U price;

   public Product(T item, U price){
       this.item = item;
       this.price = price;
   }

   public T getItem(){
       return this.item;
   }

   public U getPrice(){
       return this.price;
   }
}
