/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Testing.client;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author warunapradeep
 */
public interface ChatClientIF extends Remote{
    void retrieveMessage(String message)throws RemoteException;

}
