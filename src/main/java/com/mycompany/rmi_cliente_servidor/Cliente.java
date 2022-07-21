/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rmi_cliente_servidor;

import java.rmi.Naming;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author jt251
 */
public class Cliente {

    public static void main(String[] args) {
        String x ="";
        String y ="";
        String host="//192.168.100.93/Operaciones";
        try {
            Operaciones Operaciones = null;
            Operaciones = (Operaciones) Naming.lookup(host);

            JOptionPane.showMessageDialog(null, "El Cliente se ha conectado");
            while (true) {             
            String menu =JOptionPane.showInputDialog(null,"Operaciones Aritmeticas\n"
                    + "1.- Sumar\n"
                    + "2.- Restar\n"
                    + "3.- Multiplicar\n"
                    + "4.- Salir\n","Cliente Servidor RPC",JOptionPane.DEFAULT_OPTION);
                switch (menu) {
                    case "1":
                        x= JOptionPane.showInputDialog(null, "Primer numero",JOptionPane.QUESTION_MESSAGE);

                        y= JOptionPane.showInputDialog(null, "Segundo numero",JOptionPane.QUESTION_MESSAGE);
                   
                        JOptionPane.showMessageDialog(null,"El resultado es:  "+ Operaciones.Suma(x, y));
                        break;
                    case "2":
                        x= JOptionPane.showInputDialog(null, "Primer numero",JOptionPane.QUESTION_MESSAGE);

                        y= JOptionPane.showInputDialog(null, "Segundo numero",JOptionPane.QUESTION_MESSAGE);
                   
                        JOptionPane.showMessageDialog(null,"El resultado es:  "+ Operaciones.Resta(x, y));
                        break;
                    case "3":
                        x= JOptionPane.showInputDialog(null, "Primer numero",JOptionPane.QUESTION_MESSAGE);

                        y= JOptionPane.showInputDialog(null, "Segundo numero",JOptionPane.QUESTION_MESSAGE);
                   
                        JOptionPane.showMessageDialog(null,"El resultado es:  "+ Operaciones.Multiplicacion(x, y));
                        break;
                        case "4":
                            JOptionPane.showMessageDialog(null,"Saliento",null,JOptionPane.WARNING_MESSAGE);
                            System.exit(0);

                        break;
                }
            }

        } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());

        }
        }
}
