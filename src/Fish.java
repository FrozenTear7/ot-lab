import java.util.ArrayList;

public class Fish extends Burger {
    public Fish(Bread bread) {
        super(bread);

        ingredients.add(new Ingredient(350, "Fish"));
    }

    public Fish(Bread bread, ArrayList<Ingredient> toAdd, ArrayList<String> toErase) {
        super(bread, toAdd, toErase);
    }
}
