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
        System.out.print("Mi edad es" + persona1.getEdad());
        System.out.print("Mi nombre es" + persona1.getNombre());
        System.out.print("Mi telefono es" + persona1.getTelefono());
    }
}
/* Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola */

class Persona{

/* Crear variables las privadas edad, nombre y telefono de la clase Persona.*/
    private Int edad;
    private String nombre;
    private Int telefono;

/* Crear gets y sets de cada propiedad.*/
    public setEdad(Int edad){
        this.edad = edad;
    }
    public getEdad(){
        return this.edad
    }

    public setNombre(String nombre){
        this.nombre = nombre;
    }
    public getNombre(){
        return this.nombre
    }

    public setTelefono(Int telefono){
        this.telefono = telefono;
    }
    public getTelefono(){
        return this.telefono
    }
}
