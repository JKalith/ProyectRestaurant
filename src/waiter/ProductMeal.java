package Waiter;

/**
 *
 * @author Cesar
 */
public class ProductMeal {

    String state;
    String code;
    String mealName;
    int mealPrice;
    int mealAmount;

    public ProductMeal() {
    }

    public ProductMeal(String mealName, int mealPrice) {
        this.mealName = mealName;
        this.mealPrice = mealPrice;
    }

    public ProductMeal(String state, String code, String mealName, int mealPrice, int mealAmount) {
        this.state = state;
        this.code = code;
        this.mealName = mealName;
        this.mealPrice = mealPrice;
        this.mealAmount = mealAmount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public int getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(int mealPrice) {
        this.mealPrice = mealPrice;
    }

    public int getMealAmount() {
        return mealAmount;
    }

    public void setMealAmount(int mealAmount) {
        this.mealAmount = mealAmount;
    }

    @Override
    public String toString() {
        return "ProductMeal{" + "state=" + state + ", code=" + code + ", mealName=" + mealName + ", mealPrice=" + mealPrice + ", mealAmount=" + mealAmount + '}';
    }

 

}
