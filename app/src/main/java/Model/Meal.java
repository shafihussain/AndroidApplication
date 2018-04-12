package Model;

/**
 * Created by Shafi on 2018-04-03.
 */

public class Meal {

    private int mealId;
    private String description;

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Meal(int mealId, String description){
        this.mealId = mealId;
        this.description = description;

    }

    @Override
    public String toString() {
        return mealId + " , " + description;
    }
}
