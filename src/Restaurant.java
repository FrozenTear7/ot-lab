public class Restaurant {
    public static void main(String[] args) {
        WhiteBread whiteBread = new WhiteBread(100);
        Classic classic = new Classic(whiteBread);
        Order order = new Order(classic, null);

        System.out.println(order.countCalories());
        System.out.println(order);
    }
}
