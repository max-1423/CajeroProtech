
package manejoarchivos;

/**
 * Es ta clase esta encargada de representar un cliente de nuestro banco.
 */
public class Cliente {

    private String nombre;
    private String username;
    private String contraseña;
    private double saldo;
    private String moneda;
    private Convertir convertir;
/**
 * Este constructor inicializa un nuevo objeto Cliente con el nombre, nombre de usuario, contraseña, saldo y moneda específicos.
 */
    public Cliente(String nombre, String username, String contraseña, double saldo, String moneda) {
        this.nombre = nombre;
        this.username = username;
        this.contraseña = contraseña;
        this.saldo = saldo;
        this.moneda = moneda;
    }
/**
 * Devuelve el nombre del cliente. 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Devuelve el nombre de usuario del cliente. 
 */
    public String getUsername() {
        return username;
    }
/**
 * Devuelve la contraseña del cliente. 
 */
    public String getContraseña() {
        return contraseña;
    }
/**
 * Devuelve el saldo actual del cliente. 
 */
    public double getSaldo() {
        return saldo;
    }
/**
 * Devuelve la moneda en la que está actualmente el saldo cliente. 
 */
    public String getMoneda() {
        return moneda;
    }
/**
 * Este método permite depositar una cantidad positiva en la cuenta del cliente.
 * Si la cantidad es mayor que 0, se suma al saldo actual.
 */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad; // Actualiza el saldo en memoria
        }
    }
/**
* Este método permite retirar una cantidad del saldo del cliente. 
* Verifica que la cantidad a retirar sea positiva y no exceda el saldo disponible.
* Si las condiciones se cumplen, la cantidad se resta del saldo y el método devuelve true, indicando que la operación fue exitosa.
* Si no, devuelve false.
*/    
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad; // Actualiza el saldo en memoria
            return true;
        }
        return false;
    }
/**
 * Este método permite convertir una cantidad del saldo actual del cliente de una moneda a otra.
 * Verifica primero si la cantidad es válida.
 * Luego, crea un objeto Convertir que maneja la conversión.
 * Si la moneda es válida, actualiza el saldo y la moneda del cliente tras realizar la conversión.
 * Devuelve true si la conversión fue exitosa y false si no.
 */
    public boolean convertir(String mon, double cantidad, String monA) {
        if (cantidad > 0) {
            convertir = new Convertir(mon, cantidad, monA);
            if (convertir.monedaExiste()) {
                saldo = convertir.convertirMoneda();//actualiza el saldo
                moneda = convertir.getMonedaActual();
                return true;
            }
            return false;
        }

        return false;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
}
