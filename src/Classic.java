import java.util.ArrayList;

public class Classic extends Burger {
    public Classic(Bread bread) {
        super(bread);

        ingredients.add(new Ingredient(300, "Bacon"));
        ingredients.add(new Ingredient(200, "TASTY MAYO(R)"));
    }

    public Classic(Bread bread, ArrayList<Ingredient> toAdd, ArrayList<String> toErase) {
        super(bread, toAdd, toErase);
    }
}
