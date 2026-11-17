package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW", "M4 Competition", "celeste");
        Auto auto2 = new Auto("Audi", "Rs3", "negro");
        Auto auto3 = new Auto("Volkswagen", "Golf", "rojo");

        auto1.mostrarDatos();
        auto2.mostrarDatos();
        auto3.mostrarDatos();
    }
}
