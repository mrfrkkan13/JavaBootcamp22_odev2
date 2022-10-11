package Constructer;

public class Product {
    public  Product(int id,String name,int stockAmount,int price,String description){
        
        this.id=id;
        this.description=description;
        this.name=name;
        this.price=price;
        this.stockAmount=stockAmount;

    }

    private int id;
    private String name;
    private int stockAmount;
    private int price;
    private String description;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStockAmount() {
        return stockAmount;
    }
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
