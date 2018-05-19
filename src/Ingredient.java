public class Ingredient {
    private int calories;
    private String name;

    public Ingredient(int calories, String name) {
        this.calories = calories;
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return name;
    }
}
