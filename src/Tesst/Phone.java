package Tesst;

public class Phone {
    private String model;

    private int price;
    private int quantity;

    public Phone(){

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Phone(String model, int price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
