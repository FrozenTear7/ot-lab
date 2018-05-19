import java.util.ArrayList;

public class Classic extends Burger {
    public Classic(Bread bread) {
        super(bread);

        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(100, "Bacon"));
    }

    public Classic(Bread bread, ArrayList<Ingredient> toAdd, ArrayList<String> toErase) {
        super(bread, toAdd, toErase);
    }
}
