import java.util.ArrayList;

public class Menu {
    private ArrayList<Food> starters = new ArrayList<>();
    private ArrayList<Food> mainDishes = new ArrayList<>();
    private ArrayList<Food> desserts = new ArrayList<>();
    private ArrayList<Food> drinks = new ArrayList<>();
    
    public void addStarter(Food food) {
        starters.add(food);
    }
    public void addMainDish(Food food) {
        mainDishes.add(food);
    }
    public void addDessert(Food food) {
        desserts.add(food);
    }
    public void addDrink(Food food) {
        drinks.add(food);
    }
    public Food getStarter(String starterName) {
        for (Food starter : starters) {
            if (starterName.equals(starter.getName())) {
                return starter;
            }
        }

        return null;
    }
    public Food getMainDish(String mainDishName) {
        for (Food mainDish : mainDishes) {
            if (mainDishName.equals(mainDish.getName())) {
                return mainDish;
            }
        }
        
        return null;
    }
    public Food getDessert(String dessertName) {
        for (Food dessert : desserts) {
            if (dessertName.equals(dessert.getName())) {
                return dessert;
            }
        }
        
        return null;
    }
    public Food getDrink(String drinkName) {
        for (Food drink : drinks) {
            if (drinkName.equals(drink.getName())) {
                return drink;
            }
        }
        
        return null;
    }
}
