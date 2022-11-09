/* Para practicar la encapsulación:
Crear clase Persona.*/

/* Crear un objeto persona en el main.*/
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        //Asignar valores a esa persona
        persona1.setEdad(28);
        persona1.setNombre("Ezequiel");
        persona1.setTelefono(2216795555);
        //Traer elementos y manipularlo
        System.out.println("Mi edad es" + persona1.getEdad());
        System.out.println("Mi nombre es" + persona1.getNombre());
        System.out.println("Mi telefono es" + persona1.getTelefono());
    }
}
/* Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola */

class Persona{

/* Crear variables las privadas edad, nombre y telefono de la clase Persona.*/
    private int edad;
    private String nombre;
    private int telefono;

/* Crear gets y sets de cada propiedad.*/
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
