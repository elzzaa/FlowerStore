package flowers;

public abstract class Item{
    public String getDescription() {
        return description;
    }

    String description;
    protected abstract double price();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;


}
