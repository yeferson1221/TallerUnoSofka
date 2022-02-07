package FruitAndVegetables;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import javax.swing.*;
import java.util.Date;


public class Employee {
    public String name;
    public String lastNameOne;
    public String lastNameTwo;
    private String documentNumber;
    public String genderType;
    public int age;
    public Date dateBirth;
    public int mobile;
    public String email;
    public String address;
    public String charge;


    /*
       metodo ParseDateBirth para validar el ingreso de la fecha
       cuando se llama este metodo, el usuario ingresa la fecha y con la libreria SimpleDateFormat
       se valida que cumpla con el formato de la fecha que se pide. En caso de que no se ingrese
       la fecha correctamente, se captura el error y se imprime.
     */
    public static Date parseDateBirthEmployee(){
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


    /*
          Se le pide al Usiario que ingrese los datos, Los cuales seran convertidos
          al formato de las propiedades segun corresponde
        */
    public void enterDataEmployee(){
        name = JOptionPane.showInputDialog("ingresar nombre Empleado: ");
        lastNameOne = JOptionPane.showInputDialog("ingresar primer apellido Empleado: ");
        lastNameTwo = JOptionPane.showInputDialog("ingresar segundo apellido Empleado: ");
        genderType = JOptionPane.showInputDialog("ingresar genero: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("ingresar edad: "));
        mobile = Integer.parseInt(JOptionPane.showInputDialog("ingresar numero de contacto: "));
        email = JOptionPane.showInputDialog("ingresar correo electronico: ");
        address = JOptionPane.showInputDialog("ingresar direccion: ");
        charge = JOptionPane.showInputDialog("ingresar cargo Empleado: ");
        documentNumber = JOptionPane.showInputDialog("Ingresar numero de documento");
        dateBirth = parseDateBirthEmployee(); // para esta propiedad se llama el metodo  parseDateBirth para que se valide y se haga la conversión
    }


     /*
          getters y setters
        */

    public void SetDocumentNumber(String documentNumber){

        this.documentNumber=documentNumber;
    }
    public void getDocumentNumber(String documentNumber){

        this.documentNumber=documentNumber;
    }

}
