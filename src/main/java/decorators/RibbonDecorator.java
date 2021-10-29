package decorators;

import flowers.Item;

public abstract class RibbonDecorator extends Decorator{
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 40 + super.getPrice();
    }
}
