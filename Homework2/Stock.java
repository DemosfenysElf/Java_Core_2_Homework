package Homework2;

public class Stock {
    private int quantity;
    private String nameOfProduct;
    public Stock(String nameOfProduct, int quantity){
        this.nameOfProduct = nameOfProduct;
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void destocking(int quantity) {
        this.quantity = this.quantity - quantity;
    }
        public void increaseInStocks(int quantity) {
        this.quantity = this.quantity + quantity;
    }
    public void setNameOfProduct(String nameOfProduct) {
        if (this.quantity == 0) {
            this.nameOfProduct = nameOfProduct;
        }else System.out.println("Нельзя менять название товара до того как товар кончится на складе!");
    }
}