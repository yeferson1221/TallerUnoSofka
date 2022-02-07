package FruitAndVegetables;

import javax.swing.*;

public class Fruit {
    public String name;
    public int price;
    private float avarageWeight;
    public String color[];
    protected  int badFruits;

    /*
             getter y setter de la clase frutas
           */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*
           metodo del array
               */
    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBadFruits() {
        return badFruits;
    }

    public void setBadFruits(int badFruits) {
        this.badFruits = badFruits;
    }

    /*
             metodo para ingresar datos
           */

    public void enterDataFruit(){
        name = JOptionPane.showInputDialog("ingresar nombre vegetal: ");
        price = Integer.parseInt(JOptionPane.showInputDialog("ingresar precio: "));
        avarageWeight = Float.parseFloat(JOptionPane.showInputDialog("ingresar :"));
    }
}
