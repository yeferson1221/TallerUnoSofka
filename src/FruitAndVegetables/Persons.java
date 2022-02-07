package FruitAndVegetables;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persons {
   public String name;
   public String lastNameOne;
   public String lastNameTwo;
   public Date dateBirthPersons;
   public float height;
   public float weight;
   public int age;

   /*
      metodo ParseDateBirthPersons para validar el ingreso de la fecha
      cuando se llama este metodo, el usuario ingresa la fecha y con la libreria SimpleDateFormat
      se valida que cumpla con el formato de la fecha que se pide. En caso de que no se ingrese
      la fecha correctamente, se captura el error y se imprime.
    */
   public static Date parseDateBirthPersons(){
      String dateBirth = JOptionPane.showInputDialog("ingresar fecha (dd/MM/yyyy) ");
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
      Date finalDate = null;
      try {
         finalDate = formato.parse(dateBirth);
      }
      catch (ParseException ex)
      {
         System.out.println(ex);
      }
      return finalDate;
   }

   public void enterDataPersons(){
      name = JOptionPane.showInputDialog("ingresar nombre : ");
      lastNameOne = JOptionPane.showInputDialog("ingresar primer apellido : ");
      lastNameTwo = JOptionPane.showInputDialog("ingresar segundo apellido : ");
      age = Integer.parseInt(JOptionPane.showInputDialog("ingresar edad: "));
      height = Float.parseFloat(JOptionPane.showInputDialog("ingresar estatura:"));
      weight = Float.parseFloat(JOptionPane.showInputDialog("ingresar estatura:"));
      parseDateBirthPersons(); // para esta propiedad se llama el metodo  parseDateBirthPersons para que se valide y se haga la conversión

   }

      /*
          getters y setters
        */

   public void SetName(String name){
      this.name=name;
   }
   public void getName(String name){
      this.name=name;
   }


}
