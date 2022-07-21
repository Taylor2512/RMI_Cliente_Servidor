/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmi_cliente_servidor;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author jt251
 */
public class Rmi extends  UnicastRemoteObject implements Operaciones{

    public Rmi() throws RemoteException {
    }

    public Rmi(int port) throws RemoteException {
        super(port);
    }

    public Rmi(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    

    @Override
    public String Suma(String a, String b) throws RemoteException {
        return String.valueOf(Integer.parseInt(b)+Integer.parseInt(a)) ;
        }

    @Override
    public String Resta(String a, String b) throws RemoteException {
        return String.valueOf(Integer.parseInt(b)-Integer.parseInt(a)) ;
    }

    @Override
    public String Multiplicacion(String a, String b) throws RemoteException {
        return String.valueOf(Integer.parseInt(b)*Integer.parseInt(a)) ;
    }
    
}
