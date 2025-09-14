public class Main {
    public static void main(String[] args) {
        Pizza margherita = new Pizza.PizzaBuilder()
                .withSize("Medium")
                .addCheese()
                .build();

        Pizza pepperoniPizza = new Pizza.PizzaBuilder()
                .withSize("Large")
                .addCheese()
                .addPepperoni()
                .addMushrooms()
                .build();

        System.out.println(margherita);
        System.out.println(pepperoniPizza);
    }
}
