package ClassesWithAtribute;

public class Main {
    public static void main(String[] args) {
        Product product=new Product();

        product.name="laptop";
        product.id=1;
        product.price=10000;
        product.stockAmount=4;
        product.description="asus laptop";

        ProductManager productManager=new ProductManager();

        productManager.Add(product);
    }
    
    
}
