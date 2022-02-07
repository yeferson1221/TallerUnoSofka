package FruitAndVegetables;

import java.util.Date;

public class Bill {
    private int code;
    public Date dateBill;

    /*
        getter y setter de clase factura
       */
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDateBill() {
        return dateBill;
    }

    public void setDateBill(Date dateBill) {
        this.dateBill = dateBill;
    }
}
