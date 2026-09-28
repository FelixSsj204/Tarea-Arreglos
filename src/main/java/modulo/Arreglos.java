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
    Productos[] producto = new Productos[1];
    //deficion de la variable cantidad y se inicializa en 0
    private int cantidad = 0;

    //Este llamado
    public void registrarProducto() {
        cantidad = 0;
        for (int i = 0; i < producto.length; i++) {

            if (i < 10) {
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto"));
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto");
                int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto"));
                int cantidad_Disponible = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad disponible de producto"));

                producto[i] = new Productos(codigo, nombre, precio, cantidad_Disponible);
            }//fin condicional para evitar mas creaciones de objetos
        }//fin del for
    }//fin metodo registrar producto

    public void mostrarProducto() {
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] != null) {
                               producto[i].informacionProducto();

            }//fin del if
        }//Fin for
    }//fin metodo Mostrar Producto

    public void buscarProducto() {
        int buscar_Producto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto"));

        for (int i = 0; i < producto.length; i++) {
            if (producto[i] != null && producto[i].getCodigo() == buscar_Producto) {
                producto[i].informacionProducto();

            } else {
                JOptionPane.showMessageDialog(null, "Error,el codigo es incorrecto, por favor verique e intente de nuevo");
            }
        }//fin for

    }//Fin metodo buscar producto

    public void venderUnidades() {

        int buscar_Producto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto:"));
        int vender = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas unidades desea vender?"));

        for (int i = 0; i < producto.length; i++) {

            if (producto[i] != null && producto[i].getCodigo() == buscar_Producto) {

                if (producto[i].getCantidad_disponible() >= vender) {
                    producto[i].setCantidad_disponible(
                            producto[i].getCantidad_disponible() - vender);

                    JOptionPane.showMessageDialog(null, "Venta realizada");
                } else {
                    JOptionPane.showMessageDialog(null, "No hay suficientes unidades");
                }

                break;
            }
        }
    }//fin metodo vender unidades

    public void reabastecerUnidades() {
        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto"));

        for (int i = 0; i < producto.length; i++) {

            if (producto[i] != null && producto[i].getCodigo() == buscar) {

                int cantidad = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese la cantidad a reabastecer"));

                if (cantidad > 0) {
                    producto[i].setCantidad_disponible(
                            producto[i].getCantidad_disponible() + cantidad);

                    JOptionPane.showMessageDialog(null, "Producto reabastecido");
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor que cero");
                }

                break;
            }
        }

    }//fin metodo reabastecer unidades

    public void calcularInventario() {
        double total = 0;

        for (int i = 0; i < producto.length; i++) {
            if (producto[i] != null) {
                total += producto[i].getPrecio() * producto[i].getCantidad_disponible();
            }
        }

        JOptionPane.showMessageDialog(null,
                String.format("Valor total del inventario: %.2f", total));
    }//fin metodo calcular Inventario
}//fin claass
