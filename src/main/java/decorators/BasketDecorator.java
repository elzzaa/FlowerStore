package decorators;

import flowers.Item;

public abstract class BasketDecorator extends Decorator{
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 4 + super.getPrice();
    }
}
