import java.util.ArrayList;

public class Burger {
    protected ArrayList<Ingredient> ingredients = new ArrayList<>();
    private Bread bread;

    public Burger() {

    }

    public Burger(Bread bread) {
        this.bread = bread;
    }

    public Burger(Bread bread, ArrayList<Ingredient> toAdd, ArrayList<String> toErase) {
        this.bread = bread;

        ingredients.addAll(toAdd);

        for (Ingredient ingredient : ingredients) {
            if (toErase.contains(ingredient.toString()))
                ingredients.remove(ingredient);
        }
    }

    public int countCalories() {
        int sum = 0;

        for (Ingredient ingredient : ingredients) {
            sum += ingredient.getCalories();
        }

        return sum;
    }

    @Override
    public String toString() {
        String result = "";

        for (Ingredient ingredient : ingredients) {
            result += ingredient.toString() + " ";
        }

        return result;
    }
}
