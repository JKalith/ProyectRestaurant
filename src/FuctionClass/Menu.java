/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FuctionClass;

import java.util.Objects;

/**
 *
 * @author james
 */
public class Menu {

    public Menu() {
    }

    public Menu(String food, String Price) {
        this.food = food;
        this.Price = Price;
    }

    /**
     * @return the food
     */
    public String getFood() {
        return food;
    }

    /**
     * @return the Price
     */
    public String getPrice() {
        return Price;
    }
    
    private String food;
    private String Price;

    @Override
    public String toString() {
        return "Menu{" + "food" + food + "Price" + Price + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.food);
        hash = 29 * hash + Objects.hashCode(this.Price);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Menu other = (Menu) obj;
        if (!Objects.equals(this.food, other.food)) {
            return false;
        }
        if (!Objects.equals(this.Price, other.Price)) {
            return false;
        }
        return true;
    }


 

    
    
    
    
}
