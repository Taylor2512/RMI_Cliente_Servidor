/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.rmi_cliente_servidor;

import java.rmi.Remote; 
import java.rmi.RemoteException;

/**
 *
 * @author jt251
 */
public interface Suma extends Remote{
    public  String Suma(String a,String b) throws RemoteException;
    
}
