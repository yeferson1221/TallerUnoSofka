package FruitAndVegetables;

public class BankAccount {
    private String nameBank;
    private int accountNumber;
    protected boolean activated;


/*
             getter y setter de la clase cuenta bancaria  aqui se encuentran todos sus metedos
             los cuales nos dejan  acceder a sus atributos privados desde otras clases
           */

    public String getNameBank(){

        return  this.nameBank;
    }

    public  int getAccountNumber(){

        return  this.accountNumber;
    }

    public  void setAccountNumber(String bankNumber){

        this.nameBank=bankNumber;
    }

    public  void setNameBank(String bank){

        this.nameBank=bank;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}




