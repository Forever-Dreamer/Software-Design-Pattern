package moleamuse.test;

import moleamuse.cookingpackage.MealCache;
import moleamuse.cookingpackage.prototype.AbstractMeal;

public class PrototypeTestDemo {
    public static void main(String[] args) {
        MealCache.loadCache();
        AbstractMeal clonedmeal1 = (AbstractMeal) MealCache.getMeal("1");
        clonedmeal1.cook();
        AbstractMeal clonedmeal2 = (AbstractMeal) MealCache.getMeal("2");
        clonedmeal2.cook();
        AbstractMeal clonedmeal3 = (AbstractMeal) MealCache.getMeal("3");
        clonedmeal3.cook();
    }
}