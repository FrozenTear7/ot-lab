import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();

        WhiteBread whiteBread = new WhiteBread(100);
        DarkBread darkBread = new DarkBread(60);

        Chips chips = new Chips(500);
        Chips chips2 = new Chips(340);

        Classic classic = new Classic(whiteBread);
        Chicken chicken = new Chicken(whiteBread);
        Fish fish = new Fish(darkBread);

        ArrayList<Ingredient> classic2toAdd = new ArrayList<>();
        classic2toAdd.add(new Ingredient(900, "HOT FLAMING CHEETOS"));
        classic2toAdd.add(new Ingredient(50, "HOT FLAMING pieczarki"));
        ArrayList<String> classic2toErase = new ArrayList<>();
        classic2toErase.add("Bacon");
        Classic classic2 = new Classic(whiteBread, classic2toAdd, classic2toErase);

        Order order1 = new Order(classic, chips);
        Order order2 = new Order(chicken, null);
        Order order3 = new Order(fish, chips2);
        Order order4 = new Order(classic2, chips2);

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);

        int i = 0;

        for (Order order : orders) {
            System.out.println("Order: " + ++i);
            System.out.println(order.countCalories());
            System.out.println(order);
            System.out.println("_______________\n");
        }
    }
}
