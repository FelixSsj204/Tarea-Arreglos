/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo;

import javax.swing.JOptionPane;

/**
 *
 * @author Felixx
 */
public class Arreglos {

    //se crea el arreglo de tipo objeto para los productos
    Productos[] producto = new Productos[2];
    //deficion de la variable cantidad y se inicializa en 0
    private int cantidad = 0;
    
    //Este llamado
    

    public void registrarProducto() {
        cantidad = 0;
        for (int i = 0; i < producto.length; i++) {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto"));
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto");
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto"));
            int cantidad_Disponible = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad disponible de producto"));

            producto[i] = new Productos(codigo, nombre, precio, cantidad_Disponible);

        }//fin del for
    }//fin metodo registrar producto

    public void mostrarProducto() {
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] == null) {
                JOptionPane.showMessageDialog(null, "No existen datos de productos cargados");
                producto[i].informacionProducto();
            } else {
                producto[i].informacionProducto();
            }//fin del if
        }//Fin for
    }//fin metodo Mostrar Producto

    public void buscarProducto() {
        int buscar_Producto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto"));

       
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] != null && producto[i].getCodigo() == buscar_Producto) {
                producto[i].informacionProducto();
                
            }else {
            JOptionPane.showMessageDialog(null,"Error,el codigo es incorrecto, por favor verique e intente de nuevo");
            }
        }//fin for
        
    }//Fin metodo buscar producto
}//fin claass
