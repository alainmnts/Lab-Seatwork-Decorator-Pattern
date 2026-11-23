public class BrewtifulCoffeeShop {
    public static void main(String[] args) {
        Coffee order1 = new BlackCoffee();
        printOrder(1, order1);

        Coffee order2 = new BlackCoffee();
        order2 = new Milk(order2);
        order2 = new CaramelSyrup(order2);
        printOrder(2, order2);

        Coffee order3 = new WhippedCream(
                            new CaramelSyrup(
                                new Sugar(
                                    new Milk(
                                        new Espresso()
                                    )
                                )
                            )
                        );
        printOrder(3, order3);
    }

    private static void printOrder(int orderNumber, Coffee coffee) {
        System.out.println("Order #" + orderNumber + ":");
        System.out.println("Ingredients: " + coffee.getDescription());
        System.out.printf("Total Cost: %.2f%n", coffee.getCost());
        System.out.println("----------------------------------------");
    }
}
