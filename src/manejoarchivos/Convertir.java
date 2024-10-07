
package manejoarchivos;

/**
 *
 * @author HP
 */
public class Convertir {

    private String moneda;
    private double valorMonetario;
    private double saldo;
    private String monedaAnterior;
/**
 * Este constructor inicializa el objeto Convertir con los valores de la moneda actual, el saldo a convertir y la moneda anterior. 
 */
    public Convertir(String moneda, double saldo, String monedaAnterior) {
        this.moneda = moneda;
        this.saldo = saldo;
        this.monedaAnterior = monedaAnterior;
    }
/**
 * Devuelve la moneda actual
*/    
    public String getMonedaActual(){
        return moneda;
    }
/**
 * Verifican si la moneda ingresada es válida. 
 * Revisa si la moneda se encuentra entre las monedas aceptadas (Dólar, Euro, Sol, Real, Yen, Boliviano).
 * Si lo está, retornan true, en caso contrario, false. 
 */
    private boolean habilitarMoneda() {
        switch (moneda) {
            case "Dolar" -> {
                return true;
            }
            case "Euro" -> {
                return true;
            }
            case "Sol" -> {
                return true;
            }
            case "Real" -> {
                return true;
            }
            case "Yen" -> {
                return true;
            }
            case "Boliviano" -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }
/**
 * Verifican si la moneda ingresada es válida. 
 * Revisa si la moneda se encuentra entre las monedas aceptadas (Dólar, Euro, Sol, Real, Yen, Boliviano).
 * Si lo está, retornan true, en caso contrario, false. 
 */
    private boolean habilitarMonedaA() {
        switch (monedaAnterior) {
            case "Dolar" -> {
                return true;
            }
            case "Euro" -> {
                return true;
            }
            case "Sol" -> {
                return true;
            }
            case "Real" -> {
                return true;
            }
            case "Yen" -> {
                return true;
            }
            case "Boliviano" -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }
/**
 * Este método establece el valor de conversión entre la monedaAnterior y la moneda actual.
 * Dependiendo de la combinación de monedas, asigna una tasa de conversión.
 * El método devuelve true si encuentra una tasa de conversión válida, y false si no.
 */
    private boolean monedaValor() {
        if (monedaExiste()) {
            if (moneda.equals("Dolar")) {
                switch (monedaAnterior) {
                    case "Dolar" -> {
                        valorMonetario = 1;
                        return true;
                    }
                    case "Sol" -> {
                        valorMonetario = 3.74;
                        return true;
                    }
                    case "Real" -> {
                        valorMonetario = 5.46;
                        return true;
                    }
                    case "Yen" -> {
                        valorMonetario = 148.72;
                        return true;
                    }
                    case "Boliviano" -> {
                        valorMonetario = 6.94;
                        return true;
                    }
                    default -> {
                        return false;
                    }
                }
            } else if (moneda.equals("Sol")) {
                switch (monedaAnterior) {
                    case "Dolar" -> {
                        valorMonetario = 0.27;
                        return true;
                    }
                    case "Sol" -> {
                        valorMonetario = 1;
                        return true;
                    }
                    case "Real" -> {
                        valorMonetario = 1.46;
                        return true;
                    }
                    case "Yen" -> {
                        valorMonetario = 39.77;
                        return true;
                    }
                    case "Boliviano" -> {
                        valorMonetario = 1.86;
                        return true;
                    }
                    default -> {
                        return false;
                    }
                }
            } else if (moneda.equals("Real")) {
                switch (monedaAnterior) {
                    case "Dolar" -> {
                        valorMonetario = 0.18;
                        return true;
                    }
                    case "Sol" -> {
                        valorMonetario = 0.69;
                        return true;
                    }
                    case "Real" -> {
                        valorMonetario = 1;
                        return true;
                    }
                    case "Yen" -> {
                        valorMonetario = 27.25;
                        return true;
                    }
                    case "Boliviano" -> {
                        valorMonetario = 1.27;
                        return true;
                    }
                    default -> {
                        return false;
                    }
                }
            } else if (moneda.equals("Yen")) {
                switch (monedaAnterior) {
                    case "Dolar" -> {
                        valorMonetario = 0.0067;
                        return true;
                    }
                    case "Sol" -> {
                        valorMonetario = 0.025;
                        return true;
                    }
                    case "Real" -> {
                        valorMonetario = 0.37;
                        return true;
                    }
                    case "Yen" -> {
                        valorMonetario = 1;
                        return true;
                    }
                    case "Boliviano" -> {
                        valorMonetario = 0.47;
                        return true;
                    }
                    default -> {
                        return false;
                    }
                }
            } else if (moneda.equals("Boliviano")) {
                switch (monedaAnterior) {
                    case "Dolar" -> {
                        valorMonetario = 0.14;
                        return true;
                    }
                    case "Sol" -> {
                        valorMonetario = 0.54;
                        return true;
                    }
                    case "Real" -> {
                        valorMonetario = 0.79;
                        return true;
                    }
                    case "Yen" -> {
                        valorMonetario = 21.45;
                        return true;
                    }
                    case "Boliviano" -> {
                        valorMonetario = 1;
                        return true;
                    }
                    default -> {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
/**
 * Este método realiza la conversión del saldo usando la tasa de cambio obtenida en monedaValor().
 * Divide el saldo entre valorMonetario para convertir la cantidad a la nueva moneda y devuelve el saldo convertido.
 */
    public double convertirMoneda() {
        if (monedaValor()) {
            saldo = saldo / valorMonetario;
            return saldo;
        }
        return saldo;
    }
/**
 * Devuelve el nombre de la nueva moneda a la que se ha convertido el saldo, o la moneda anterior si la conversión no fue válida. 
 */
    public String getNuevaMoneda() {
        if(monedaValor()){
            return moneda;
        }
        return monedaAnterior;
    }
/*
* Este método comprueba si tanto la moneda como la monedaAnterior son válidas.
* Solo si ambas monedas son válidas, retorna true.
*/
    public boolean monedaExiste() {
        return habilitarMoneda() && habilitarMonedaA();
    }
}
