package FruitAndVegetables;

import javax.swing.*;

public class Vegetables {
    public String name;
    public int price;
    public  float weight;
    public int  quantity;
    protected  int badVegetables;
    protected  float weightBadVegetables;

     /*
          metodo ingresar vegetales
        */

    public void enterDataVegetables(){
        name = JOptionPane.showInputDialog("ingresar nombre vegetal: ");
        price = Integer.parseInt(JOptionPane.showInputDialog("ingresar precio: "));
        quantity = Integer.parseInt(JOptionPane.showInputDialog("ingresar cantidad: "));
        badVegetables = Integer.parseInt(JOptionPane.showInputDialog("ingresar cantidad: "));
        weightBadVegetables = Float.parseFloat(JOptionPane.showInputDialog("ingresar peso verduras malas "));
        weight = Float.parseFloat(JOptionPane.showInputDialog("ingresar peso "));

    }

    /*
          metodo getter y setter
        */
    public int getBadVegetables() {
        return badVegetables;
    }

    public void setBadVegetables(int badVegetables) {
        this.badVegetables = badVegetables;
    }

    public float getWeightBadVegetables() {
        return weightBadVegetables;
    }

    public void setWeightBadVegetables(float weightBadVegetables) {
        this.weightBadVegetables = weightBadVegetables;
    }
}
