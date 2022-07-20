/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cliente;

import java.*;
import java.util.*;
import javax.swing.JOptionPane;
import org.apache.xmlrpc.XmlRpc;
import org.apache.xmlrpc.XmlRpcClient;
import org.apache.xmlrpc.secure.SecureXmlRpcClient;

/**
 *
 * @author jt251
 */
public class Ciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x ="";
        String y ="";
        Object resultado;
        try {
            XmlRpcClient client= new SecureXmlRpcClient("http://192.168.100.93:8080");
            Vector<String> parametros =new Vector<String>();
            JOptionPane.showMessageDialog(null, "El Cliente se ha conectado");
            while (true) {             
            String menu =JOptionPane.showInputDialog(null,"Suma de dos numeros\n"
                    + "1.- Sumar\n"
                    + "2.- Salir\n","Cliente Servidor RPC",JOptionPane.DEFAULT_OPTION);
                switch (menu) {
                    case "1":
                        x= JOptionPane.showInputDialog(null, "Primer numero",JOptionPane.QUESTION_MESSAGE);

                        y= JOptionPane.showInputDialog(null, "Segundo numero",JOptionPane.QUESTION_MESSAGE);
                        parametros.add(y);
                        parametros.add(x);
                        resultado= client.execute("miServidorRcp.Suma", parametros);
                        JOptionPane.showMessageDialog(null,"la suma"+ resultado);
                        parametros.clear();
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
