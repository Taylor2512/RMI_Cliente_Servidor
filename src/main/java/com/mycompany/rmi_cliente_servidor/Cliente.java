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
        String host="//localhost/Suma";
        try {
            Suma suma = null;
            suma = (Suma) Naming.lookup(host);

            JOptionPane.showMessageDialog(null, "El Cliente se ha conectado");
            while (true) {             
            String menu =JOptionPane.showInputDialog(null,"Suma de dos numeros\n"
                    + "1.- Sumar\n"
                    + "2.- Salir\n","Cliente Servidor RPC",JOptionPane.DEFAULT_OPTION);
                switch (menu) {
                    case "1":
                        x= JOptionPane.showInputDialog(null, "Primer numero",JOptionPane.QUESTION_MESSAGE);

                        y= JOptionPane.showInputDialog(null, "Segundo numero",JOptionPane.QUESTION_MESSAGE);
                   
                        JOptionPane.showMessageDialog(null,"la suma es"+ suma.Suma(x, y));
                        break;
                        case "2":
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
