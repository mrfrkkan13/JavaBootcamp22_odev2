package Constructer;

public class Main {
    public static void main(String[] args) {
        Product product=new Product(1,"laptop",4,1000,"asus laptop");

     /*   product.setName("laptop");
        product.setId(1);
        product.setPrice(10000);
        product.setStockAmount(4);
        product.setDescription("asus laptop");*/

        ProductManager productManager=new ProductManager();

        productManager.Add(product);
    }
    
}
