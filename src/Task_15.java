
class Product {
    public String name;
    public int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}

class Box {
    public String id;
    public Product[] products;
    public Box(String id, Product[] products) {
        this.id = id;
        this.products = products;
    }
}

class Storage{
    public Box[] boxes;

    public Storage(Box[] boxes) {
        this.boxes = boxes;
    }

    public int totQuant(String prodName) {
        int totalQuantity = 0;
        for (Box box : boxes) {
            for (Product product : box.products) {
                if (product.name.equals(prodName)) {
                    totalQuantity+=product.quantity;
                }
            }
        }
        return totalQuantity;
    }
}

public class Task_15 {
    public static void main(String[] args) {
//        Box box1 = new Box("Box1",
//                new Product[]{
//                        new Product("Carrot", 15),
//                        new Product("Apples", 20)
//                });
//        Box box2 = new Box("Box2",
//                new Product[]{
//                        new Product("Potato", 10),
//                        new Product("Carrot", 12)
//                });
//        Storage sto = new Storage(
//                new Box[]{box1, box2});
//        System.out.println("Tot. quantity of product: " +
//                sto.totQuant("Carrot"));
        MyString newstring = new MyString("Hello World");

        System.out.println(newstring);
        System.out.println(newstring.getLength());
        newstring.insert(5, ",");
        System.out.println(newstring);


    }
}
