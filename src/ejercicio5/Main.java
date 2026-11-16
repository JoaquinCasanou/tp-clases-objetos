package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setBase(5);
        rectangulo.setAltura(3);

        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Área: " + rectangulo.calcularArea());
    }
}
