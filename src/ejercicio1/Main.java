package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Joaquin";
        persona1.edad = 22;

        Persona persona2 = new Persona();
        persona2.nombre = "Lucia";
        persona2.edad = 25;

        System.out.println("Persona 1 -> Nombre: " + persona1.nombre + ", Edad: " + persona1.edad);
        System.out.println("Persona 2 -> Nombre: " + persona2.nombre + ", Edad: " + persona2.edad);
    }
}
