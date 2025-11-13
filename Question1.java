import java.util.*;
class Product {
  private final long ProductId;
  private final String ProductName;
  private final String ProductDescription;
  private final long ProductQuantity;

  Product(long ProductId, String ProductName, String ProductDescription, long ProductQuantity) {
    this.ProductId = ProductId;
    this.ProductName = ProductName;
    this.ProductDescription = ProductDescription;
    this.ProductQuantity = ProductQuantity;
  }
  @Override
  public String toString() {
    return "Product ID: " + ProductId +
           "\nProduct Name: "+ ProductName +
           "\nProduct Description: "+ ProductDescription +
           "\nProduct Quantity: "+ ProductQuantity;
  }
}

public class Question1 {
  public static void main(String[] args) {
    List<Product> productItem = new ArrayList<>();
    // Adding new product
    productItem.add(new Product(1, "Pool Game", "Billiards game table", 12));
    productItem.add(new Product(2, "Football", "Ferwafa approve 5 fields", 5));
    productItem.add(new Product(3, "Cricket", "Cricket ball description", 3));

    System.out.println("\n==================Product List=======================\n");
    for (Product product: productItem) {
      System.out.println(product +"\n");
    }
    System.out.println("");
  }
}