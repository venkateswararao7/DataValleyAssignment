import java.io.*;

class Product implements Serializable {
    private int id;
    private String name;
    private String category;
    private double price;

    // Constructor
    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters and setters
    // Assume they are implemented here

    // Method to print product details
    public void printDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Category: " + category);
        System.out.println("Product Price: " + price);
    }
}

public class ProductClass {
    public static void main(String[] args) {
        // Serialization
        Product product = new Product(1, "Phone", "Electronics", 500.0);

        try (FileOutputStream fos = new FileOutputStream("product.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(product);
            System.out.println("Serialization successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (FileInputStream fis = new FileInputStream("product.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Product deserializedProduct = (Product) ois.readObject();
            System.out.println("\nDeserialized Product Details:");
            deserializedProduct.printDetails();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
