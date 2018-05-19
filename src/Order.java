public class Order {
    private Burger burger;
    private Chips chips;

    public Order(Burger burger, Chips chips) {
        this.burger = burger;
        this.chips = chips;
    }

    public int countCalories() {
        int sum = 0;
        if(burger != null)
            sum += burger.countCalories();
        if(chips != null)
            sum += chips.countCalories();

        return sum;
    }

    @Override
    public String toString() {
        String result = "";
        if(burger != null)
            result += burger.toString();
        if(chips != null)
            result += chips.toString();

        return result;
    }
}
