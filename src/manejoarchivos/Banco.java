package manejoarchivos;

import java.io.*;
import java.util.*;

public class Banco {
    private List<Cliente> clientes;
    private final String clientesFile = "clientes.txt";
    
/**
 * El constructor inicializa la lista de clientes y llama al método cargarClientes() para leer la información de los clientes desde el archivo y cargarlos en la lista.
 */
    public Banco() {
        clientes = new ArrayList<>();
        cargarClientes(); // Carga de clientes al iniciar
    }
    
/**
 * Este método lee los datos del archivo clientes.txt y los convierte en objetos Cliente que se agregan a la lista clientes.
 * Si el archivo no se puede leer, el programa imprime un mensaje de error
 */
    private void cargarClientes() {
        try (BufferedReader br = new BufferedReader(new FileReader(clientesFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                String nombre = datos[0];
                String username = datos[1];
                String contraseña = datos[2];
                double saldo = Double.parseDouble(datos[3]);
                String moneda = datos[4];
                clientes.add(new Cliente(nombre, username, contraseña, saldo, moneda));
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar el archivo de clientes. Se creará uno nuevo al registrar.");
        }
    }
    
/**
 * Este método registra un nuevo cliente si su nombre no está ya registrado.
 * Crea un nuevo objeto Cliente con un saldo inicial de 0 y lo añade a la lista de clientes.
 * Después de eso, llama al método guardarClientes() para actualizar el archivo.
 */
    public boolean registrarCliente(String nombre, String username, String contraseña, String moneda) {
        if (existeCliente(nombre)) {
            return false; // Nombre ya registrado
        }

        double saldoInicial = 0; // No establecer un saldo inicial
        Cliente nuevoCliente = new Cliente(nombre, username, contraseña, saldoInicial, moneda);
        clientes.add(nuevoCliente);
        guardarClientes(); // Guardar clientes después de agregar
        return true; // Registro exitoso
    }
    
/**
 * Este método verifica si ya existe un cliente con el mismo nombre en la lista de clientes.
 */
    private boolean existeCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre)) {
                return true; // El cliente ya existe
            }
        }
        return false; // El cliente no existe
    }
    
/**
 * Este método guarda la lista de clientes en el archivo clientes.txt.
 * Sobrescribe el archivo con la información de cada cliente, incluyendo el nombre, username, contraseña, saldo y moneda.
 */
    public void guardarClientes() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(clientesFile))) {
            for (Cliente cliente : clientes) {
                // Guarda el nombre, username, contraseña, saldo y moneda en el archivo
                bw.write(cliente.getNombre() + "," + cliente.getUsername() + "," + cliente.getContraseña() + "," 
                        + cliente.getSaldo() + "," + cliente.getMoneda());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los clientes.");
        }
    }
    
/**
 * Este método autentica a un cliente verificando su nombre de usuario y contraseña.
 * Si ambos coinciden, devuelve el objeto Cliente correspondiente.
 * Si no, devuelve null, indicando que la autenticación ha fallado.
 */
    public Cliente autenticar(String username, String contraseña) {
        for (Cliente cliente : clientes) {
            if (cliente.getUsername().equals(username) && cliente.getContraseña().equals(contraseña)) {
                return cliente; // Retorna el cliente autenticado
            }
        }
        return null; // Autenticación fallida
    }
/**
 * Este método devuelve la lista de clientes actuales. 
 */
    public List<Cliente> getClientes() {
        return clientes;
    }
}