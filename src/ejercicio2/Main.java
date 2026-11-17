package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Titulo 1", "Nombre 1", 2008);
        Libro libro2 = new Libro("Titulo 2", "Nombre 2", 2005);

        System.out.println("Libro 1 -> Título: " + libro1.titulo + ", Autor: " + libro1.autor + ", Año: " + libro1.anio);
        System.out.println("Libro 2 -> Título: " + libro2.titulo + ", Autor: " + libro2.autor + ", Año: " + libro2.anio);
    }
}
