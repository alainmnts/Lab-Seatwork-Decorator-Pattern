public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee wrappedCoffee) {
        super(wrappedCoffee);
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 10.00;
    }
}
