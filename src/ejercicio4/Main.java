package ejercicio4;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.setSaldo(15000.50);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        cuenta.setSaldo(20000);
        System.out.println("Saldo modificado: $" + cuenta.getSaldo());
    }
}
