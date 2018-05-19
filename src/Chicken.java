import java.util.ArrayList;

public class Chicken extends Burger {
    public Chicken(Bread bread) {
        super(bread);

        ingredients.add(new Ingredient(460, "Chicken"));
    }

    public Chicken(Bread bread, ArrayList<Ingredient> toAdd, ArrayList<String> toErase) {
        super(bread, toAdd, toErase);
    }
}
