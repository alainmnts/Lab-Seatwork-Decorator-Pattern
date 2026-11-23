public class CaramelSyrup extends CoffeeDecorator {
    public CaramelSyrup(Coffee wrappedCoffee) {
        super(wrappedCoffee);
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Caramel Syrup";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 40.00;
    }
}
