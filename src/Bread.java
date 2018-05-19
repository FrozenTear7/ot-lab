public class Bread {
    private int calories;

    public Bread() {

    }

    public Bread(int calories) {
        this.calories = calories;
    }

    public int countCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Bread";
    }
}
