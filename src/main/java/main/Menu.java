/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import modulo.Arreglos;

/**
 *
 * @author Felixxx
 */
public class Menu {

    private int opcion;
    private Arreglos arreglo = new Arreglos();

    public void menuProductos() {

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("             Selecione\n"
                    + "                                                1. Registro producto\n"
                    + "                                                2. Mostrar producto\n"
                    + "                                                3. Buscar producto\n"
                    + "                                                4. Vender Unidades \n"
                    + "                                                5. Reabastecer Unidades\n"
                    + "                                                6. Calcular valor total del inventario  \n"
                    + "                                                7  Sair \n"
                    + "                                                Inserte una opcion\n"
            ));
            switch (opcion) {
                case 1:
                    arreglo.registrarProducto();
                    break;
                case 2:
                    arreglo.mostrarProducto();
                    break;
                case 3:
                    arreglo.buscarProducto();
                    break;
                case 4:
                    arreglo.venderUnidades();
                    break;
                case 5:
                    arreglo.reabastecerUnidades();
                    break;
                case 6:
                    arreglo.calcularInventario();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa....");

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "El numero digitado no corresponde a una opcion");
            }//fin switch

        } while (7 != opcion);

    }//Fin metodo menu Productos
}
