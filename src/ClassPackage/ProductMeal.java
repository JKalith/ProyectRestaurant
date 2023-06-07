/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassPackage;

/**
 *
 * @author Cesar
 */
public class ProductMeal {
    String mealCode;
    String mealName;
    double mealPrice;
    int mealAmount;

    public ProductMeal() {
    }

    public ProductMeal(String mealCode, String mealName, double mealPrice, int mealAmount) {
        this.mealCode = mealCode;
        this.mealName = mealName;
        this.mealPrice = mealPrice;
        this.mealAmount = mealAmount;
    }

    public String getMealCode() {
        return mealCode;
    }

    public void setMealCode(String mealCode) {
        this.mealCode = mealCode;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public double getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(double mealPrice) {
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
        return "ProductMeal{" + "mealCode=" + mealCode + ", mealName=" + mealName + ", mealPrice=" + mealPrice + ", mealAmount=" + mealAmount + '}';
    }
    
    
}
