public class Chips {
    private int calories;

    public Chips(int calories) {
        this.calories = calories;
    }

    public int countCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Chips";
    }
}
