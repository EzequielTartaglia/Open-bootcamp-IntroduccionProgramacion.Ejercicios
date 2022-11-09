/* Crea una clase Persona con las siguientes variables:

•La edad
•El nombre
•El teléfono

*/
public class Main {
    public static void main(String[] args) {

        /* Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.*/
        Cliente persona1 = new Cliente();
        persona1.edad = 15;
        persona1.nombre = "Ezequiel";
        persona1.telefono = 154567810;
        persona1.credito = 150000;

        System.out.println("La edad del cliente es:"+persona1.edad);
        System.out.println("El nombre del cliente es:"+persona1.nombre);
        System.out.println("El telefono del cliente es:"+persona1.telefono);
        System.out.println("El credito del cliente es:"+persona1.credito);

        //Crear un trabajador (con su variable salario)
        Trabajador trabajador1 = new Trabajador();
        trabajador1.edad = 25;
        trabajador1.nombre = "Mario";
        trabajador1.telefono = 154568810;
        trabajador1.salario = 150000.95;

        System.out.println("La edad del trabajador es:"+trabajador1.edad);
        System.out.println("El nombre del trabajador es:"+trabajador1.nombre);
        System.out.println("El telefono del trabajador es:"+trabajador1.telefono);
        System.out.println("El salario del trabajador es:"+trabajador1.salario);
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;
}

/* Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.*/
class Cliente extend Persona{

    //Variable unica
    int credito;
}


/* Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador. */
class Trabajador extend Persona{

    //Variable unica
    float salario;
}
