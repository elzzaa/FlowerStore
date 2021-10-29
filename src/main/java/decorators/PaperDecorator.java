package decorators;

import flowers.Item;

public abstract class PaperDecorator extends Decorator{
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 13 + super.getPrice();
    }
}
