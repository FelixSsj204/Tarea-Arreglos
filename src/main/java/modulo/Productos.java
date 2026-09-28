/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
class Productos {

    private int codigo;
    private String nombre;
    private int precio;
    private int cantidad_disponible;

    public Productos(int codigo, String nombre, int precio, int cantidad_disponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad_disponible = cantidad_disponible;
    }

    public Productos() {
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public void informacionProducto() {
        
        JOptionPane.showMessageDialog(null, "Datos del Producto \n"
                + "Codigo " + codigo +"\n"
                + "Nombre " + nombre +"\n"
                + "Precio " + precio +"\n"
                + "Cantidad_Disponible " + cantidad_disponible);
    }//fin metodo informacion producto

}
